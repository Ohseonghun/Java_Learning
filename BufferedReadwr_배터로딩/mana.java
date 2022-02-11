package BufferedReadwr_배터로딩;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class mana {
 
	public static void main(String[] args) throws IOException {
		// 'throws IOException' 오류 예외 처리 (필수)
		// tip Ctrl+Shift+O 를 누를 경우 해당 import 메소드를 자동으로 호출
		
		System.out.println("aaa");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 출력
 
		int N = Integer.parseInt(br.readLine());
		//스캐너의 역활, 입력된 값은 'N'이다
        
		StringTokenizer st;
		//입력 값의 토큰화
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			// " " 띄어쓰기 전과 후를 나누어 인식하여 객체화(토큰화) 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			//출력 (첫번째 'int'자료형 토큰을 가져온다 + 두번쨰 'int' 자료형 토큰을 가져온다 + 다음 줄로 넘기기)
		}
		br.close();
		// 입력. 콘솔창 닫기
        
		bw.flush();
		//출력. 메모리에 잔류해 있는 값을 모두 배출
		
		bw.close();
		//출력 닫기
		
 
	}
}