package Extends_상속;
//이번에는 Dog 클래스를 좀 더 구체화 시키는 HouseDog 클래스를 만들어 보자.
//HouseDog 클래스는 Dog 클래스를 상속하여 다음과 같이 만들 수 있다.

//기존 변수의 변경의 개념이다, 추가의 개념이 아니다.

//https://wikidocs.net/280

public class Amimal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Amimal {
	//나는 개다
	void sleep() {
		System.out.println(this.name + " zzz");
		//"happy zzz"를 위한 "zzz"
	}
}

class HouseDog extends Dog {
	//들개와 집에서 자는 개를 구분 하고싶다
	//집에서 자는 개는 "happy zzz in house"를 출력 하고싶다.
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
//	HouseDog 클래스에 Dog 클래스와 동일한 형태의 sleep 메소드를 구현하면 
//	부모 클래스 보다 자식 클래스를 우선시 하게 되어 
//	HouseDog 클래스의 sleep 메소드가 호출되게 된다. 덮어쓰기!
}

public class Oberriding {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep(); // happy zzz in house 출력
	}
}