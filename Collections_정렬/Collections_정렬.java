package Collections_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/////Collections.sort/////
//Collections.sort의 메소드를 이용해서 정렬할 수 있습니다. 
//바로 기본 자료형의 wrapper 클래스의 객체들은 전부 이 Collections.sort를 통해서 알아서 정렬이 가능합니다. 
public class Collections_정렬 {
	public static void printList(String title,List list){
		System.out.println(title);
		System.out.println(list);
	}
	public static void main(String []ar){
		List<Integer> intList=new ArrayList<>();
		
		intList.add(4);
		intList.add(5);
		intList.add(1);
		intList.add(8);
		intList.add(3);
		
		printList("정수 정렬 전",intList);
		
		Collections.sort(intList);
		
		printList("정수 정렬 후",intList);
		
		System.out.println("==============================");
		
		List<String> strList=new ArrayList<>();
		
		strList.add("de");
		strList.add("dc");
		strList.add("ci");
		strList.add("ad");
		strList.add("aa");
		
		printList("문자열 정렬 전",strList);
		
		Collections.sort(strList);
		
		printList("문자열 정렬 후",strList);
		
		//출력//
//		정수 정렬 전
//		[4, 5, 1, 8, 3]
//		정수 정렬 후
//		[1, 3, 4, 5, 8]
//		==============================
//		문자열 정렬 전
//		[de, dc, ci, ad, aa]
//		문자열 정렬 후
//		[aa, ad, ci, dc, de]
	}
}

