package BK009.LeapYear;
// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//https://www.acmicpc.net/problem/2753

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int leapYear = sc.nextInt();
//		int leapYear = 2000;

		if (leapYear % 4 == 0) {
			if (leapYear % 400 == 0) {
				System.out.println("1");
			} else if (leapYear % 100 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		} else
			System.out.println("0");
	}
}
