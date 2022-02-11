package Extends_상속;
//오버다이팅이 '변경'의 개념이라면 오버로딩은 '추가'의 개념이다


public class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}

	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
	//이미 sleep이라는 메소드가 있지만 동일한 이름의 sleep메소드를 또 생성할 수 있다.
	//단, 메소드의 입력항목이 다를 경우만 가능하다.
	//새로 만든 sleep메소드는 입력항목으로 hour라는 int 자료형이 추가되었다.
	//입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩(method overloading)이라고 한다.
}

public class Overloading {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // happy zzz in house 출력
		houseDog.sleep(3); // happy zzz in house for 3 hours 출력
	}
}