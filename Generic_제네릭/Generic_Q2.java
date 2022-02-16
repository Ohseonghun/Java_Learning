package Generic_제네릭;
//기본 데이터 타입과 제네릭
//제네릭은 참조 데이터 타입에 대해서만 사용할 수 있다. 
//기본 데이터 타입에서는 사용할 수 없다. 따라서 아래와 같이 코드를 변경한다.
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
}
public class Generic_Q2 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        System.out.println(p1.id.intValue());
    }
}