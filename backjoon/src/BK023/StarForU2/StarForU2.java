package BK023.StarForU2;

// 1째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//https://www.acmicpc.net/problem/2439

import java.util.Scanner;

public class StarForU2 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
	 
			int N = sc.nextInt();
			sc.close();
	 
			for (int i = 1; i <= N; i++) {
				for (int y = 1; y <= N - i; y++) {
					System.out.print(" ");
				}
				for (int z = 0; z < i; z++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}