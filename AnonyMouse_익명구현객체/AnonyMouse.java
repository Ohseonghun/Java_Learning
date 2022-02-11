package AnonyMouse_익명구현객체;

public class AnonyMouse {
// 구현할 인터페이스
//람다식이나 UI 프로그래밍에서 이벤트의 처리용으로 많이 사용되기 때문에 그 형태를 알아둘 필요가 있다.
	interface Car {
		public void run();

		public void stop();
	}

	public class AnonymouseTest1 {

		public void main(String[] args) {
// 익명구현 객체 fooCar
// 한번 쓰고 버릴 객체가 필요할때 이 익명구현객체란 것을 이용할 수 있다.

			Car fooCar = new Car() {
				public void run() {
					System.out.println("달려라!");
				}

				public void stop() {
					System.out.println("머.. 멈춰!!!");
				}
			};

			fooCar.run();
			fooCar.stop();
		}

	}
}
