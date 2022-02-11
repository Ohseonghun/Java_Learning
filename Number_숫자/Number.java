package Number_숫자;

import String_문자열.MyString;

public class Number {

	int age = 10;
	long countOfStar = 8764827384923849L;
	float pi = 3.14F;
	double morePi = 3.14159265358979323846;
	// 자료형에 따라 담을수 한수 한계치가 달리진다

	int octal = 023; // 십진수: 19
	int hex = 0xC; // 십진수: 12
//	0(숫자 '0')으로 시작하면 8진수, 
//  x(숫자 '0' + 알파벳 'x')로 시작하면 16진수가 된다.

	public static void main(MyString[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		// 자바는 +, -, *, / 기호를 이용하여 두 숫자간 사칙연산을 수행한다.

		System.out.println(7 % 3); // 1 출력
		System.out.println(3 % 7); // 3 출력
		// %는 나머지 값을 반환하는 연산자이다.
		// 7을 3으로 나누면 나머지는 1이 될 것이고 3을 7로 나누면 나머지는 3이 될 것이다.
	
		int i = 0;
		int j = 10;
		i++;//증감 연산자 +1
		j--;//증감 연산자 -1

		System.out.println(i);  // 1 출력
		System.out.println(j);  // 9 출력
	}

}
