package BK015.FastAB;
//scanner와 print를 쓰지 않는 다른 방식으로 접근하여 시간을 단축하라
//https://www.acmicpc.net/problem/15552

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String A = br.readLine();
		int N = Integer.parseInt(A);

		for (int i = 0; i < N; i++) {

			String B = br.readLine();
			String array[] = B.split(" ");

			StringTokenizer st = new StringTokenizer(B);

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			bw.write(x + y + "\n");
		}
		br.close();
		bw.flush();
		br.close();

	}
}
