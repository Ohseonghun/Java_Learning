package Generic_제네릭;

//제네릭 생략

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
}

public class Generic_생략 {
	public static void main(String[] args) {

		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		// 기본형을 사용할 수 없기에 인트거로 정수를 래핑 해 준다.
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
		p1.<EmployeeInfo>printInfo(e);

		// 위 코드와 아래의 코드는 정확이 똑같이 작동한다.

		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		// 이미 위 단계에서 래핑을 했기때문에 이후 명시 할 필요성이 없어진 것이다.
		Person p1 = new Person(e, i);
		Person p2 = new Person(e, i);

		// 출력
		p1.printInfo(e);
	}

}

// 오류를 잡아내지 못하지만 컴파일 과정에서 오류 발생