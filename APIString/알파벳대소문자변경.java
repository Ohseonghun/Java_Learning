package APIString;

//알파벳 대소문자 변경(toLowerCase(),toUpperCase())
//toLowerCase()는 모두 소문자로 변경, toUpperCase()는 모두 대문자로 변경해준다.

public class 알파벳대소문자변경 {

		String str = "Java Programming";
		str.toLowercase();
		// =>"java programming"
		str.toUppercase();
		// =>"JAVA PROGRAMMING"

		// 이때 대소문자 관계없이 같은지 비교해주려면 equalsIgnoreCase() 메소드를 사용할 수 있다.

		str1.equalsIgnoreCase(str);

}
