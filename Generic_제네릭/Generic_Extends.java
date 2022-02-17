package Generic_제네릭;

//extends 제네릭 상속
//제네릭으로 올 수 있는 데이터 타입을 특정 클래스의 자식으로 제한할 수 있다.

interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
//즉 Person의 T는 Info 클래스나 그 자식 외에는 올 수 없다.
//extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있다.
    public T info;
    Person(T info){ this.info = info; }
}
public class Generic_Extends {
	public static void main(String[] args) {
		Person p1 = new Person(new EmployeeInfo(1));
		Person<String> p2 = new Person<String>("부장");
	}
}
