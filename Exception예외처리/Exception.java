package Exception예외처리;

import java.io.BufferedReader;
import java.io.FileReader;

//오류가 날 경우 그 프로그램은 정지한다 하지만 오류가 발생했을때
//계속 진행을 하거나 특정 행동을 취하게 하고시싶다면 어떻게 해야할까?

class Excepti {
	public void main(String[] args) {
//////////여러 오류 상황///////////

////존재하지 않는 파일을 열려고 시도////
		BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
		br.readLine();
		br.close();
//존재하지 않는 파일을 열려고 시도하면 FileNotFoundException라는 이름의 예외가 발생한다.

////0으로 다른 숫자를 나누는 경우////
		int c = 4 / 0;
//ArithmeticException 예외가 발생한다.

////배열 선언이 틀리는 경우////
		int[] a = { 1, 2, 3 };
		System.out.println(a[3]);
//a[3]은 a 배열의 4번째 값이므로 a 배열에서 구할 수 없는 값이다. 
//그래서 ArrayIndexOutOfBoundsException 오류가 발생했다.
	}
}

//이제 예외처리의 기법에 대해서 살펴보자. 
//다음은 예외처리를 위한 try, catch문의 기본 구조이다.

// try {
//	    ...
// } catch(예외1) {
//	    ...
// } catch(예외2) {
//	    ...
// ...
// }
// try 문안의 문장을 수행하는 도중에 예외가 발생하면 예외에 해당되는 catch문이 수행된다.

public class Exception예시 {

	int c;

	try
	{
		c = 4 / 0;
	}catch(
	ArithmeticException e)
	{
		c = -1; // 예외가 발생하여 이 문장이 수행된다.
	}
}
