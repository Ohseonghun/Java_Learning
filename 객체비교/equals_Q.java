package 객체비교;

import java.util.Objects;

//equals는 동일한 객체라면 true, 아니라면 false를 리턴한다.

public class equals_Q {
	public static void main(String[] args) {
		// equals()를 이용하면 객체의 value를 비교할 수 있습니다.
		Integer a = new Integer(10);
		Integer b = new Integer(10);

		System.out.println(a.equals(b));
		
		//Objects.equals()
		//객체의 equals()를 사용하는 것과 동일한 결과를 리턴합니다
		System.out.println(Objects.equals(a, b));

		//equals()와 차이점은, Objects.java의 메소드를 
		//보면 null check 코드가 있기 때문에 
		//NullPointerException은 발생하지 않습니다.
	}
}
