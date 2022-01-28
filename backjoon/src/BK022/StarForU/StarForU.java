package BK022.StarForU;

// 1째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//https://www.acmicpc.net/problem/2438

import java.util.Scanner;

public class StarForU {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= s; i++) {
			for (int z = 1; z <= i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
