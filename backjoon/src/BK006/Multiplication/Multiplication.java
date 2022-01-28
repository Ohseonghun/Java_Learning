package BK006.Multiplication;

// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
// (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
// https://www.acmicpc.net/problem/2588

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * ((b / 10) % 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);

	}
}
