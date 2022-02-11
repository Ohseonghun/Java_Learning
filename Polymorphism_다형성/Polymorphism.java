package Polymorphism_다형성;
//객체지향 프로그래밍의 특징 중에는 다형성(폴리모피즘, Polymorphism)이 있다. 

//도대체 다형성은 무엇이고 이게 왜 필요한 걸까? 예제를 통해 차근차근 알아보자.
//https://wikidocs.net/269

interface Predator {
//    ... (생략) ...
}

class Animal {
//    ... (생략) ...
}

class Tiger extends Animal implements Predator {
//    ... (생략) ...
}

class Lion extends Animal implements Predator {
//   ... (생략) ...
}

class ZooKeeper {
//    ... (생략) ...
}

class Bouncer {
	void barkAnimal(Animal animal) { // 어떤 동물이 짖었다! 어떤 동물일까?
		if (animal instanceof Tiger) {// Tiger의 객체인 경우에는 "어흥"
			System.out.println("어흥");
		} else if (animal instanceof Lion) {// Lion 객체인 경우에는 "으르렁"
			System.out.println("으르렁");
		}
		// instanceof 는 어떤 객체가 특정 클래스의 객체인지를 조사할 때 사용되는 자바의 내장 명령어이다.
		// "animal 객체는 Tiger 클래스로 만들어진 객체인가?"를 묻는 조건문이다.

		else if (animal instanceof Crocodile) {
			System.out.println("쩝쩝");
		} else if (animal instanceof Leopard) {
			System.out.println("캬옹");
		}
		// 위와 같은 방식은 동물 클래스가 추가될 때마다 분기문이 추가되어야 하므로 좋지 않다.
		// 하지만 우리는 인터페이스를 배웠으므로 좀 더 나은 해법을 찾을 수 있다.
		// Polymorphism2 에서 계속
	}

	public class Polymorphism {
		public static void main(String[] args) {
			Tiger tiger = new Tiger();
			Lion lion = new Lion();

			Bouncer bouncer = new Bouncer();
			bouncer.barkAnimal(tiger); // "어흥"
			bouncer.barkAnimal(lion); // "으르렁"
		}
	}
}
