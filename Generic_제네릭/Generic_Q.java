package Generic_제네릭;
//https://opentutorials.org/module/516/6237

class Person<T>{
	//T는 아래 코드의 <> 안에 지정된 데이터 타입에 의해서 결정된다. 
    public T info;
    //info의 데이터 타입은 T로 되어 있다. 
    //그런데 T라는 데이터 타입은 존재하지 않는다. 이 값은 아래 코드의 T에서 정해진다.
}

public class Generic_Q {

	 public static void main(String[] args) {
	        Person<String> p1 = new Person<String>(); 
	        //p1.info의 데이터형식 : String = <T>
	        
	        Person<StringBuilder> p2 = new Person<StringBuilder>(); 
	        //p2.info의 데이터형식 : StringBuilder = <T>
	    }
	 //즉 클래스를 정의 할 때는 info의 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터 타입을 지정하는 기능이 제네릭이다. 
}
