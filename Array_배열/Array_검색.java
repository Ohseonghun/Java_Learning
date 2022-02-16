package Array_배열;

//배열 항목에서 특정 값이 위치한 인덱스를 얻는 것을 배열 검색이라고 한다. 
//배열 항목을 검색하려면 먼저 Arrays.sort()메소드로 항목들을 
//오름차순으로 정렬한 후, Arrays.binarySearch()메소드로 항목을 찾아야한다.

import java.lang.reflect.Member;
import java.util.Arrays;

public class Array_검색 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };

		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		// =>2
		Member m1 = new Member("유재석");
		Member m2 = new Member("강호동");
		Member m3 = new Member("전현무");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		// =>1
	}
}