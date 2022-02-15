package toString_Q;
//객체의 문자 정보를 리턴한다. 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다. 

//기본적으로 Object 클래스의 toString()은 "클래스명@16진수해시코드"로 구성된 문자정보를 리턴한다.

public class toString {
	public void main(String[] args) {
		
		Object obj = new Object();
		System.out.println(obj.toString());

		// 출력 java.lang.Object@de6ced
		
//이 리턴값은 별 값어치가 없는 정보이므로 Object 하위 클래스는 toString() 
//메소드를 재정의(오버라이딩) 하여 간결하고 유익한 정보를 리턴하도록 되어있다.
	}
}
