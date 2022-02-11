package Interface_인터페이스2;

///////////디폴트 메서드//////////
//인터페이스의 메서드는 몸통(구현체)을 가질 수 없지만 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.
//디폴트 메서드를 구현하면 Predator 인터페이스를 구현한 Tiger, Lion 등의 실제 클래스는 printFood 메서드를 구현하지 않아도 사용할 수 있다.
//그리고 디폴트 메서드는 오버라이딩이 가능하다. 즉, printFood 메서드를 실제 클래스에서 다르게 구현하여 사용할수 있다.
interface Predator {
	default void printFood() {// 메소드명 가장 앞에 "default" 라고 표기
		System.out.printf("my food is %s\n", getFood());
	}

///////////스테틱 메서드///////////
//인터페이스에 스태틱 메서드를 구현하면 인터페이스명.스태틱메서드명 과 같이 사용하여 
//일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.

	interface Predator1 {
		String getFood();

		default void printFood() {
			System.out.printf("my food is %s\n", getFood());
		}

		int LEG_COUNT = 4; // 인터페이스 상수

		static int speed() {
			return LEG_COUNT * 30;
		}
	}

//생략//
	Object getFood();
}

//https://wikidocs.net/217