package Array_배열;

import java.util.Arrays;

public class Array_복사 {
	char[] arr1 = {'J','A','V','A'};
	char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	//=> ["J","A","V","A"]
	char[] arr3 = Arrays.copyOfRange(arr1,1,3);
	//여기서 시작인덱스는 포함되지만 끝 인덱스는 포함하지 않는다.
	//=> [A","V"]
	
}

class 방법2 { //단순히 배열을 복사할 목적이라면 System.arraycopy() 메소드를 이용할 수 있다.
	//예제
	char[] arr1 = {'J','A','V','A'};

	//방법1
	char[] arr2 = Arrays.copyOf(arr1, arr1.length);
	//방법2
	char[] arr3 = Arrays.copyOfRange(arr1,0,arr1.length);
	//방법3
	char arr4 = new char[arr1.length]
	System.arraycopy(arr1,0,arr4,0,arr1.length);
}