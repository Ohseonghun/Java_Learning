package Extends_상속;
//클래스는 항상 새로 만들어서 사용
//예제이기 때문에 하나로 모아 둠
//자바는 다중 상속을 지원 하지 않음 C++, 파이선 등 지원 하는 언어가 있긴 하다.
//https://wikidocs.net/280

class Animal{
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	//클래스 상속을 위해서는 extends 라는 키워드를 사용한다.
	//Dog 클래스는 Animal 클래스를 상속
	
    void sleep() {
        System.out.println(this.name+" zzz");
        //보통 자식 클래스는 부모 클래스의 기능에 더하여 좀 더 많은 기능을 갖도록 작성한다.
    }
}

public class Extend {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);  // poppy 출력
        dog.sleep();  // poppy zzz 출력
    }
}