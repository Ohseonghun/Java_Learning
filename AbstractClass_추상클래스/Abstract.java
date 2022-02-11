package AbstractClass_추상클래스;

public class Cat extends Animal{

	public Cat(){
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("야~옹!");
	}

}

public class Dog extends Animal{
	
	public Dog(){
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("왈왈!");
	}

}

public abstract class Animal {
	public String kind;
	
	public void breath(){
		System.out.println("숨 쉰다.");
	}
	//추상메서드
	public abstract void sound();//구체적인 구현부는 없음!
}


abstract class Predator  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		Animal animal = null;
		
		animal = new Dog(); //자동 타입변환
		animal.sound(); //Dog에 구현된 Sound()메서드 실행
		
		animal = new Cat(); //자동 타입변환
		animal.sound(); //Cat에 구현된 Sound()메서드 실행
		
		
		animalSound(new Dog()); //자동 타입변환 (매개변수도 가능)
		animalSound(new Cat()); //자동 타입변환 (매개변수도 가능)
	}
	//자동 타입변환 : 추상클래스 타입 변수는 추상클래스를 상속받은 실체클래스의 타입으로 자동 타입변환이 된다. 
	private static void animalSound(Animal animal) {
		animal.sound();
	}

}

