package BK014.Synthesis;
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//https://www.acmicpc.net/problem/8393

import java.util.Scanner;

public class Synthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int pls = 0;

		for (int i = 1; i < n; i++)
			pls += i;

		System.out.println(pls + n);
	}
}
