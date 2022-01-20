package Bk016.int_N;

// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
// https://www.acmicpc.net/problem/2741

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class int_N {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int intN = Integer.parseInt(br.readLine());
		int i = 1;

		while (i <= intN) {
			bw.write(i + "\n");
			i++;
		}
		br.close();
		bw.flush();
		br.close();
	}
}
