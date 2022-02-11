package Constructor_생성자;
//입력 항목이 다른 생성자를 여러 개 만들 수 있는데 이런 것을 생성자 오버로딩(Overloading) 이라고 한다.

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
    HouseDog(String name) {
        this.setName(name);
        //String 자료형을 입력으로 받는 생성자
    }

    HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
        //int 자료형을 입력으로 받는 생성자
    }

    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Oberloading {
    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);  // happy 출력
        System.out.println(yorkshire.name);  // yorkshire 출력
    }
}