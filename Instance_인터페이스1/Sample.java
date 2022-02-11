package Instance_인터페이스1;

//public class Sample {
//    public static void main(String[] args) {
//        Animal cat = new Animal();
//        cat.setName("danby");
//        System.out.println(cat.name);
//        
//        Animal dog = new Animal();
//        dog.setName("jon");
//        System.out.println(dog.name);
//        dog.sleep();  // poppy zzz 출력
        
//new 는 객체를 생성할 때 사용하는 키워드이다. 
//이렇게 하면 Animal 클래스의 인스턴스(instance)인 cat, 즉 Animal의 객체가 만들어진다.
//        }
//}

class Animal {
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
}

public class Sample {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz in house 출력
        houseDog.sleep(3);  // happy zzz in house for 3 hours 출력
    }
}