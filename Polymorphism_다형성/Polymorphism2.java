package Polymorphism_다형성;

interface Predator {
//  ... (생략) ...
}

interface Barkable { // '짖음' 새로운 인터페이스 작성
	void bark();
}

//만약 getFood 메소드와 bark 메소드를 모두 사용하고 싶다면 어떻게 해야 할까?
interface BarkablePredator extends Predator, Barkable {
	//Tiger 로 선언된 tiger 객체를 그대로 사용하거나 다음과 같이 
	//getFood, bark 메소드를 모두 포함하는 새로운 인터페이스를 새로 만들어 사용하면 된다.
}


class Animal {
//  ... (생략) ...
}

class Tiger extends Animal implements Predator, Barkable { // 새로 생성한 인터페이스 추가
//  ... (생략) ... 이거 사과

	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Animal implements Predator, Barkable { // 새로 생성한 인터페이스 추가
// ... (생략) ... 이거 바나나

	public void bark() {
		System.out.println("으르렁");
	}
}

class ZooKeeper {
//  ... (생략) ...
}

class Bouncer {
//	void barkAnimal(Animal animal) { 
//		if (animal instanceof Tiger) {
//			System.out.println("어흥");
//		} else if (animal instanceof Lion) {
//			System.out.println("으르렁"); 
//		}
	
	    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable을 사용
	        animal.bark();
	        //"어흥" 또는 "으르렁"을 출력하던 부분을 그냥 bark 메소드를 호출하도록 변경
	    }
	}

	public class Polymorphism2 {
		public void main(String[] args) {
			Tiger tiger = new Tiger();
			Lion lion = new Lion();

			Bouncer bouncer = new Bouncer();
			bouncer.barkAnimal(tiger); // "어흥"
			bouncer.barkAnimal(lion); // "으르렁"
		}
	}
	//위 예제에서 사용한 tiger, lion 객체는 각각 Tiger, Lion 클래스의 객체이면서 
	//Animal 클래스의 객체이기도 하고 Barkable, Predator 인터페이스의 객체이기도 하다.
	//이러한 이유로 barkAnimal 메소드의 입력 자료형을 Animal에서 Barkable 로 바꾸어 사용할 수 있는 것이다.
	

