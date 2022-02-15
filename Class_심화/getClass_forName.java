package Class_심화;
//객체명만 가지고는 해당 객체가 어느 클래스에 속하는지 종종 한 번에 파악하기 어려운 경우가 있다. 

//이러한 경우에는 Object 클래스가 가지고 있는 getClass와 같은 메서드를 사용하면 유용하다.

////Class 객체 얻기(getClass(), forName())////
//Object는 모든 클래스의 최상위 클래스이므로 모든 클래스에서 getClass() 메소드를 호출할 수 있다.

class Student {
	private String name;
	private String sex;

	public Student() {

	}

	public Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "이름은 " + name + "이고 성별은 " + sex + "입니다. ";
	}

}

public class getClass_forName {
	public static void main(String[] args) {
		
		Student student = new Student();
		// 학생객체 생성
		
		System.out.println(student.getClass());
		Class clazz = student.getClass();
		// 학생객체의 정보를 받는 클래스 객체 생성
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackage().getName());
		System.out.println(clazz.getSimpleName());
		
// 		출력
//		class Class_심화.Student
//		Class_심화.Student
//		Class_심화
//		Student

	}

}
