package Constructor_생성자;
// 생성자를 사용하는 이유는 메소드를 정의 하지 않아도 필드를 초기화 할 수 있기 때문이다. 
// 객체 생성 열활 뿐만이 아니라 초기화의 역활도 하기 때문에 코드가 간결 해진다.
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
    }
    //위 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 생성자(Constructor)라고 한다.
//    생성자의 규칙
//    1. 클래스명과 메소드명이 동일하다.
//    2. 리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)
    
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Constructor {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog();
        System.out.println(dog.name); // null 출력
        //dog객체의 name 변수에 아무런 값도 설정하지 않았기 때문에 null이 출력될 것이다.
        
        //위에서 아래로 수정
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name); //happy 출력
    }
}