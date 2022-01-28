package Bk017.Back_N;

//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//https://www.acmicpc.net/problem/2742
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_N {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		br.close();

		while (N > 0) {
			System.out.println(N);
			N--;
		}
	}
}