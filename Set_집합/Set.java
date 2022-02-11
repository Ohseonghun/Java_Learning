package Set_집합;
//집합(Set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 자료형이다.

//https://wikidocs.net/157108

import java.util.Arrays;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
		System.out.println(set); // [e, H, l, o] 출력

//		출력된 자료형에는 l 문자가 하나 빠져 있고 순서도 뒤죽박죽이다.
//      집합 자료형에는 다음과 같은 2가지 큰 특징이 있기 때문이다.
//      1. 중복을 허용하지 않는다.
//      2. 순서가 없다(Unordered).

		// 집합 자료형을 정말 유용하게 사용하는 경우는 교집합, 합집합, 차집합을 구할 때이다.
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

		/////////// 교집합은 retainAll를 이용하면 교집합을 간단히 구할 수 있다./////////////////////
		HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
		// s1의 데이터를 유지하기 위해 s1으로 intersection이라는 HashSet 객체를 Copy하여 생성하였다.
		intersection.retainAll(s2); // 교집합 수행
		System.out.println(intersection); // [4, 5, 6] 출력

		///////////////// 합집합은 addAll 메소드를 사용하여 구할 수 있다.///////////////
		HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
		union.addAll(s2); // 합집합 수행
		System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
		// 이때 4, 5, 6처럼 중복해서 포함된 값은 한 개씩만 표현된다.

		///////////// 차집합은 removeAll 메소드를 사용하여 구할수 있다. ////////////////
		HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
		substract.removeAll(s2); // 차집합 수행
		System.out.println(substract); // [1, 2, 3] 출력
		
		//---------------------------------------------------------------------
		//
		//집합 자료형에 값을 추가할 때에는 add 메소드를 사용한다.
        //HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
        
        //여러 개의 값을 한꺼번에 추가할 때는 다음과 같이 addAll 메소드를 사용한다.
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java")); // 합집합을 구할 때도 addAll을 사용했다.
        System.out.println(set);  // [Java, To, Jump] 출력
        
		//특정 값을 제거하고 싶을 때는 다음과 같이 remove 메소드를 사용한다.
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
	}
}