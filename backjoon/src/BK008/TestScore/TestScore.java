package BK008.TestScore;
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D 
// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
// https://www.acmicpc.net/problem/9498
	
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testScore = sc.nextInt();

		if (testScore >= 90) {
			System.out.println("A");
		} else if (testScore >= 80) {
			System.out.println("B");
		} else if (testScore >= 70) {
			System.out.println("C");
		} else if (testScore >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
