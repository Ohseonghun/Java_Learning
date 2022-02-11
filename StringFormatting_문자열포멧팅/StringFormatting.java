package StringFormatting_문자열포멧팅;
//https://wikidocs.net/205

public class StringFormatting {
	public static void SrtingFormat(String[] args) {

		System.out.println(String.format("내 통장에는 %d원이 있어", 5000));
		System.out.println(String.format("우리 집 고양이 이름은 %d 라고 해", "단비"));
		//문자열 안에서 숫자를 넣고 싶은 자리에 %d 문자를 넣어 준다
		//여기에서 %d는 문자열 포맷 코드라고 부른다.
		
		System.out.println(String.format("%10s", "hi"));  // "        hi" 출력
		//전체 길이가 10개인 문자열 공간에서 대입되는 값을 오른쪽으로 정렬하고 그 앞의 나머지는 공백으로 남겨 두라는 의미이다.
		
		System.out.println(String.format("%-10sjane.", "hi"));  // "hi        jane." 출력
		//hi를 왼쪽으로 정렬하고 나머지는 공백으로 채웠음을 볼 수 있다.
	
		System.out.println(String.format("%.4f", 3.42134234));  // 3.4213 출력
		System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력
		//소수점 네 번째 자리까지만 나타내고 싶은 경우에는 위와 같이 사용한다. 
		//즉 여기서 '.'의 의미는 소수점 포인트를 말하고 그 뒤의 숫자 4는 소수점 뒤에 나올 숫자의 개수를 말한다. 
	
		System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
		//하지만 System.out.printf 메서드를 사용하면 String.format 
		//메서드 없이도 동일한 형식으로 포매팅된 문자열을 출력할 수 있다.
	
	}
	
}
