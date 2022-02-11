package Constructor_생성자;

class Animal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	Dog() {
//		생성자가 구현
//		성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 위와 같은 생성자를 디폴트 생성자라고 부른다.

//    	위와 같이 디폴트 생성자를 구현하면 new Dog() 로 Dog 클래스의 객체가 만들어 질 때 위에 구현한 디폴트 생성자가 실행될 것이다. 
//    	만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 위와같은 디폴트 생성자를 추가한다. 
//    	하지만 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다.
		
	}

	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name);
	}

	void sleep() {
		System.out.println(this.name + " zzz in house");
	}

	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}

public class defaultConstructor {
	public static void main(String[] args) {
		HouseDog dog = new HouseDog("happy");
		System.out.println(dog.name); // happy 출력
	}
}