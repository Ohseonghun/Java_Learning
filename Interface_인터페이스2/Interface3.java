package Interface_인터페이스2;//인터페이스의 메소드
//자, 그런데 위 ZooKeeper 클래스에 약간의 문제가 발생했다. 
//사자가 오면 바나나를 던져 줘야 하는데 어떤 육식 동물이 오던 사과만 던져 주게 됐다.

interface Predator {
    String getFood(); // 그런데 좀 이상하다. 메소드에 몸통이 없다?
    
    //인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. 
    //그 이유는 인터페이스는 규칙이기 때문이다. 
    //위에서 설정한 getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다.
    
}


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() { //인터페이스의 메소드는 항상 public으로 구현해야 한다.
        return "apple";
    }
}

class Lion extends Animal implements Predator {    
    public String getFood() { //음식을 준다. 무엇을?
        return "banana"; //바나나를 리턴
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        //System.out.println("feed apple"); // 항상 feed apple 만을 출력한다.
        System.out.println("feed "+predator.getFood());
    }
}

public class Interface3 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  //feed apple
        zooKeeper.feed(lion);  //feed banana
    }
}

//https://wikidocs.net/217
//육식 동물들의 종류만큼의 feed 메소드가 필요했던 ZooKeeper를 인터페이스를 이용하여 구현했더니 단 한개의 feed 메소드로 구현이 가능해졌다.
//여기서 중요한 점은 메소드의 갯수가 줄어든게 아니라 ZooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서 
//동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다. 바로 이 점이 인터페이스의 핵심이다.