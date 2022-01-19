package If_Q;

public class MyIf {
	public static void main(String[] args) {
		
		boolean money = true; //"돈이 있다(참)
		
		if (money) { //참 일 경우 실행
			System.out.println("택시를 타고 가라");
		} else { // 참이 아닐 경우 실행
			System.out.println("걸어가라");
		}
		
		
		int x = 3;
		int y = 2;
		
//		x < y	x가 y보다 작다
//		x > y	x가 y보다 크다
//		x == y	x와 y가 같다
//		x != y	x와 y가 같지 않다
//		x >= y	x가 y보다 크거나 같다
//		x <= y	x가 y보다 작거나 같다
		
		System.out.println(x > y);	// true 출력
		System.out.println(x < y);  // false  출력
		System.out.println(x == y);  // false 출력
		System.out.println(x != y);  // true 출력
		
		
		
		// 구체적 조건이 있을 경우//
		int money2 = 2000;
		if (money2 >= 3000) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		
		////// and(&&), or(||), not(!) ///////
		
//		x || y - x와 y 둘 중 적어도 하나가 참이면 참이다
//		x && y - x와 y 모두 참이어야 참이다
//		!x - x가 거짓이면 참이다
		
		int money3 = 2000;
		boolean hasCard = true;

		if (money3>=3000 || hasCard) {
		    System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}
		
		///////////contains///////////
		//List 자료형에는 해당 아이템이 있는지 조사하는 contains 메소드가 있다.
		//contains 메소드는 조건문에 많이 활용되는데 어떻게 활용이 되는지 살펴보자.
		
		ArrayList<String> pocket = new ArrayList<String>();
		
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");

		if (pocket.contains("money")) { // 조건 1 참이면 여기서 종료
		    System.out.println("택시를 타고 가라");
		}else { // 거짓일 경우 진행
		    if (hasCard) { // 거짓일 경우 조건2 참이라면 종료
		        System.out.println("택시를 타고 가라");
		    }else {  // 조건2가 거짓을 경우 실행
		        System.out.println("걸어가라");
		    }
		}
		
		
	}
}