package Interface_인터페이스2;
		
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
}

class Lion extends Animal {
}

class ZooKeeper {
	
    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("feed apple");
    }

    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
        System.out.println("feed banana");
    }
    
  //동물원에 호랑이와 사자뿐이라면 ZooKeeper 클래스는 더이상 할일이 없겠지만 악어, 표범등이 계속 추가된다면 
  //ZooKeeper는 육식동물이 추가될 때마다 매번 다음과 같은 feed 메소드를 추가해야 한다.

  //이렇게 육식동물이 추가 될 때마다 feed 메소드를 추가해야 한다면 사육사(ZooKeeper)가 얼마나 귀찮겠는가? 
  //이런 어려움을 극복하기 위해서는 인터페이스의 도움이 필요하다.


}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}