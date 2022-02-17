package Generic_제네릭;
// 제네릭화
class StudentInfo {
	public int grade;

	StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T> {
	public T info;

	Person(T info) {
		this.info = info;
	}
}

public class Generic_Q1 {
	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		// <T> 가 EmployeeInfo의 데이터 타입임을 선언
		EmployeeInfo ei1 = p1.info;
		System.out.println(ei1.rank); // 성공

		Person<String> p2 = new Person<String>("부장");
		// <T> 가 String 데이터 타입임을 선언
		String ei2 = p2.info;
		System.out.println(ei2.rank); // 컴파일 실패
		//p2.info가 String이고 String은 rank 필드가 없는데 이것을 호출하고 있기 때문이다.
	}
}

// 오류를 잡아내지 못하지만 컴파일 과정에서 오류 발생