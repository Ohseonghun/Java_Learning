package Interface_인터페이스2;

interface Predator {
}
//육식동물(Predator) 인터페이스를 추가
//class가 아닌 interface 라는 키워드를 이용하여 작성한다.
//인터페이스는 클래스와 마찬가지로 Predator.java와 같은 단독 파일로 저장하는 것이 일반적인 방법이다.

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
}
//implements 라는 키워드를 사용

class Lion extends Animal implements Predator {    
}
//implements 라는 키워드를 사용

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed apple");
    }
}
//feed 메소드의 입력으로 Tiger, Lion을 각각 필요로 했지만 이제 이것을 Predator라는 인터페이스로 대체할 수 있게 되었다

//상속에서 공부했던 IS-A 관계가 인터페이스에도 마찬가지로 적용된다.
//"Tiger is a Predator", "Lion is a Predator"

//객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성(폴리모피즘)이라 한다. '다양성' 참조

class Crocodile extends Animal implements Predator {
//	ZooKeeper는 feed 메소드를 추가할 필요가 없다. 다만 육식동물이 추가 될 때마다 다음과 같이 
//	Predator 인터페이스를 구현한 클래스를 작성하기만 하면 되는 것이다.
}

public class Interface2 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed apple 출력
    }
}