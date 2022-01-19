package StringBuffer_Q;
//StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
//https://wikidocs.net/276

public class StringBuffer {
	public static void Buffer(String[] args) {
		StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
		//결과 값 hello jump to java

		//StringBuffer 자료형은 append 메소드를 사용하여 계속해서 문자열을 추가해 나갈 수 있다. 
		//그리고 위 예제와 같이 toString() 메소드를 이용하면 String 자료형으로 변경할 수 있다.
		
		
		//위 예제를 String 자료형만 가지고 표현하면 다음과 같이 작성할 수 있다.
		String result = "";
		result += "hello";
		result += " ";
		result += "jump to java";
		System.out.println(result);
		//결과 값 hello jump to java
		
		//String 자료형은 한번 값이 생성되면 그 값을 변경할 수가 없다. (immutable 하다)
		//하지만 StringBuffer는 이와 반대로 값을 변경할 수 있다(mutable 하다).
		//StringBuffer 자료형은 String 자료형보다 무거운 편에 속한다.
		//new StringBuffer() 로 객체를 생성하는 것은 일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리다.
		//따라서 문자열 추가나 변경등의 작업이 많을 경우 StringBuffer를, 변경 작업이 거의 없는 경우 String을 사용.

		
		
		//////////StringBuilder//////////
		//Buffer와 비슷한 자료형으로 Builder가 있다. 
		//Builder의 사용법은 Buffer의 사용법과 동일하다.
	
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		String result = sb.toString();
		System.out.println(result);
		
		// 버퍼는 멀티 스레드 환경에서 안전, 빌더는 버퍼보다 성능이 우수
		// 동기화를 고려 할 필요가 없는 상황에서는 버퍼보다는 빌더가 좋다.
		
		
		
		///////////insert///////////
		//insert 메소드는 특정 위치에 원하는 문자열을 삽입할 수 있다.
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		sb.insert(0, "hello ");
		System.out.println(sb.toString());
		//결과 hello jump to java
		
		//insert를 사용하여 0 번째 위치에 "hello " 라는 문자열을 삽입했다.
		
		
		
		//////////////substring///////////
		//substring 메소드는 String 자료형의 substring 메소드와 동일하게 사용된다.
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello jump to java");
		System.out.println(sb.substring(0, 4));
		// 결과 Hell
		
		
	}

	
	private char[] substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}
}