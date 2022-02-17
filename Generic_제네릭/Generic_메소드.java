package Generic_제네릭;

//메소드에 적용
//제네릭은 메소드에 적용할 수도 있다. 


class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T, S> {
	public T info;
	public S id;

	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}

	public <U> void printInfo(U info) {
		System.out.println(info);
	}
} // 제네릭 메소드

public class Generic_메소드 {
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e);
	}
}
