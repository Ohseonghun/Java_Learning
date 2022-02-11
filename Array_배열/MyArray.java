package Array_배열;

//배열 (Array)
//https://wikidocs.net/206

public class MyArray {
	public static void UrArray (String[] args) {
	
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		//배열은 자료형 타입 바로 옆에 [] 기호를 사용하여 표현한다.
	
		
		// 배열에도 길이가 있다
		String[] weeks1 = new String[7];
		// 변수 생성, [길이 설정]
		weeks1[0] = "월";
		weeks1[1] = "화";
		weeks1[2] = "수";
		weeks1[3] = "목";
		weeks1[4] = "금";
		weeks1[5] = "토";
		weeks1[6] = "일";
		
		//배열의 값 접근
		String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks2[3]); // 네번째 항목 '목' 출력 (자바는 0부터 숫자를 센다)
}
}
