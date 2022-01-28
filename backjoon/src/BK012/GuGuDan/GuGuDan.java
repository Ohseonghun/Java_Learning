package BK012.GuGuDan;
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
	//https://www.acmicpc.net/problem/2739
import java.util.Scanner;

public class GuGuDan {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(+a+ " * " +i+ " = " + a*i);
		}
	}
}
