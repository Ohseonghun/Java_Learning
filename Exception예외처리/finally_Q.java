package Exception예외처리;
//지만 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분이 있어야 한다면 어떻게 해야 할까?

public class Sample {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0;
            sample.shouldBeRun();  // 이 코드는 실행되지 않는다.
            //. catch구문으로 넘어가기 때문이다.
            //이런 경우를 처리하기 위해 자바는 finally 구문을 제공한다.
        } catch (ArithmeticException e) {
            c = -1;
        }
    }
}

public class Sample {
    public void shouldBeRun() {
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            c = -1;
        } finally {
            sample.shouldBeRun();  // 예외에 상관없이 무조건 수행된다.
        }
    }
}
//finally 구문은 try 문장 수행 중 예외발생 여부에 상관없이 무조건 실행된다.
//따라서 위 코드를 실행하면 sample.shouldBeRun() 메소드가 수행되어 "ok, thanks" 문장이 출력될 것이다.