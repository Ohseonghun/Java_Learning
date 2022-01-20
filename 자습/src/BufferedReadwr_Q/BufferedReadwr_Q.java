package BufferedReadwr_Q;
//https://coding-factory.tistory.com/280

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedReadwr_Q {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

		String s = br.readLine();

		String array[] = s.split(" "); // 공백마다 데이터 끊어서 배열에 넣음
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken()); 


//		String t = "abcdefg"; // 출력할 문자열
		bw.write(a + b + "java" + "\n"); // 버퍼에 있는 값 전부 출력
		bw.flush(); // 남아있는 데이터를 모두 출력시킴
		bw.close(); // 스트림을 닫음
	}
}
