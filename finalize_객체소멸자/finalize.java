package finalize_객체소멸자;
//참조하지 않는 배열이나 객체는 Garbage Collector가 객체를 소멸하기 직전에
//마지막으로 객체의 소멸자(finalize())를 실행시켜 힙 영역에서 자동으로 소멸시킨다.
//
//finalize()는 기본적으로 실행 내용이 없다. 
//만약 객체가 소멸되기 전에 마지막으로 사용했던 자원(데이터 연결, 파일 등)을 닫고 싶거나,
//중요한 데이터를 저장하고 싶다면 재정의를 할 수 있다.


class Counter{
    private int no;
    public Counter(int no){
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println(no + "번 객체의 finalize()가 실행됨");
    }
}

public class finalize{
    public static void main(String[] args){
        Counter counter = null;
        for(int i=1;i<=50;i++){
            counter = new Counter(i);

            counter = null; //쓰레기로 만듬
            System.gc();    //Garbage Collector 실행 요청
        }
    }
    //실행 결과를 보면 무작위로 소멸시키는 것을 볼 수 있다. 
    //그리고 전부 소멸시키는 것이 아니라 메모리 상태를 보고 일부만 소멸시킨다.
    //
    //finalize()메소드가 호출되는 시점은 명확하지 않다. 
    //만약 프로그램 종료시 즉시 자원을 해제하거나 즉시 데이터를 최종 저장해야 한다면, 
    //일반 메소드에서 작성하고 프로그램이 종료될 때 명시적으로 메소드를 호출하는 것이 좋다.
}