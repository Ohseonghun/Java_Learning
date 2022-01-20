package BK011.AlarmClock;
//원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다
//https://www.acmicpc.net/step/4

import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int h = in.nextInt();
		int m = in.nextInt();
		in.close();
		
		if (m < 45) {
			h--;
			m = 60 - (45 - h);
			if (h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}

		else {
			System.out.println(h + " " + (m - 45));
		}
	}

}
