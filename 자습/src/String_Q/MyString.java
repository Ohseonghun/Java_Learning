package String_Q;

public class MyString {

	public static void main(String[] args) {

////////////// 리터럴(literal) 표기///////////
		String a = "Happy Java";
		String b = "a";
		String c = "123";
		// 고정된 값을 그대로, 언제든지, 계속 불변하게 출력 가능하다

		String a = new String("Happy Java");
		String b = new String("a");
		String c = new String("123");
		// 두번째 방식은 항상 새로운 String 객체를 만든다.

		
		
/////////////// equals//////////////////
		// equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false 출력
		System.out.println(a.equals(c)); // true 출력

		// 문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다.
		// == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.

		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b)); // true
		System.out.println(a == b); // false

		// == 은 두개의 자료형이 동일한 객체인지를 판별할 때
		// 사용하는 연산자이기 때문에 false를 리턴한다.

		
		
///////////////indexOf//////////////////////
		// indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
		String a = "Hello Java";
		System.out.println(a.indexOf("Java")); // 6 출력

		// "Hello Java" 라는 문자열에서 "Java"라는 문자열은 일곱번째 문자('J')부터 시작이다.
		// 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다.

		
		
//////////////contains//////////////
		// contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.

		String a = "Hello Java";
		System.out.println(a.contains("Java")); // true 출력
		// 문자열 a는 "Java"라는 문자열을 포함하고 있기 때문에 true를 리턴한다.

		
		
//////////////charAt//////////////////
		//charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
		
		String a = "Hello Java";
		System.out.println(a.charAt(6));  // "J" 출력
		//6으로 문자를 찾아야 하는 이유는 자바는 숫자를 0부터 세기 때문이다.
		
		
//////////////replaceAll/////////////////
		// replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
		String a = "Hello Java";
		System.out.println(a.replaceAll("Java", "World"));  // Hello World 출력

		// "Hello Java" 라는 문자열에서 "Java"가 "World"로 바뀌었다.
		
		
		
/////////////substring/////////////
		// substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
		String a = "Hello Java";
		System.out.println(a.substring(0, 4));  // Hell 출력
		
		//문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 단 끝위치는 포함이 안된다는 점에 주의하자.
		
		
		
/////////////toUpperCase//////////////
		//toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다.
		//(모두 소문자로 변경할때는 toLowerCase를 사용한다.)

		String a = "Hello Java";
		System.out.println(a.toUpperCase());  // HELLO JAVA 출력
		
		
//////////////split///////////////////
		//split 메서드는 문자열을 특정 구분자로 분리하는 메서드이다.

		String a = "a:b:c:d";
		String[] result = a.split(":");  // result는 {"a", "b", "c", "d"}
		
		//위의 예처럼 "a:b:c:d" 라는 문자열을 ":" 문자로 나누어 
		//{"a", "b", "c", "d"} 문자열 배열을 만들수 있다.
	}

	public static char[] format(java.lang.String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
