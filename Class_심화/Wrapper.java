package Class_심화;
//Wrapper(포장) 클래스

//자바는 기본 타입(byte, char, int, boolean 등)의 값을 갖는 객체를 생성할 수 있다. 
//이런 객체를 Wrapper 객체라 한다.

public class Wrapper {

	// boxing 기본 타입의 값을 포장 객체로 만드는 과정
	Integer obj1 = new Integer(100);
	Integer obj2 = new Integer(200);
	//자바 버전 9 이후부터 사용할 수 없게 되었다.
	// 오토박싱 오토 언박싱으로 바뀌었기 때문에 그냥 다음과 같이 쓰면 된다.
//	Integer obj1 = 100;
//	Integer obj2 = 200;
	
	Integer obj3 = Integer.valueOf("300");

	// unboxing 포장 객체에서 기본 타입의 값을 얻어내는 과정
	int value1 = obj1.intValue();
	int value2 = obj2.intValue();
	int value3 = obj3.intValue();
}
