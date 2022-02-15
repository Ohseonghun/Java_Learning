package nesting_중첩;

//객체 지향 프로그램에서 클래스들은 서로 긴밀한 관계를 맺고 상호작용을 한다.
//클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나,
//특정 클래스와 관계를 맺을 경우에는 관계 클래스를 클래스 내부에 선언하는 것이 좋다.

//https://dahye-jeong.gitbook.io/java/java/undefined/java-nested

/////중첩 클래스/////
//중첩 클래스는 클래스 내부에 선언되는 위치에 따라서 두 가지로 분류된다.

class nesteClass {
	class NestedClassName {
		// 중첩 클래스란 클래스 내부에 선언한 클래스를 말한다.
	}
}

class A {

	// 멤버 클래스 : 클래스의 멤버로서 선언
	// 클래스나 객체가 사용 중이라면 언제든지 재사용 가능
	// 인스턴스 멤버 클래스 : A 객체를 생성해야만 사용할 수 있는 B 중첩 클래스
	// 인스턴스 멤버 클래스는 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 메소드는 선언할 수 없다.

	class B {
		B() {
		} // 생성자

		int field1; // 인스턴스 필드

		void method1() {
		}// 인스턴스 메소드

		// static int field2; 정적 필드(X)
		// static void method(){}정적 메소드(X)
	}

	static class C {
// 정적 멤버 클래스 : A클래스로 바로 접근할 수 있는 C 중첩 클래스
		C() {
		} // 생성자

		int field1; // 인스턴스 필드
		static int field2; // 정적 필드

		void method1() {
		} // 인스턴스 메소드

		static void method2() {
		} // 정적 메소드
	}
}

class D {
	void method() {
		/* 로컬 클래스 */
		// 로컬 클래스는 접근 제한자(public, private) 및 static을 붙일 수 없다.
		// 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문이다.

		class D { // 메소드 내에 선언된 클래스를 로컬(local) 클래스라고 한다.
			D() {
			} // 생성자

			int field1; // 인스턴스 필드

			void method1() {
			} // 인스턴스 메소드
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	// 로컬 클래스 : 메소드 내부에서 선언
	// 메소드 실행 시에만 사용되고, 메소드 실행이 종료되면 없어진다.
}

/////////중첩 클래스의 접근 제한//////
//멤버 클래스가 선언됨에 따라 바깥 클래스의 필드와 메소드에 사용 제한이 생긴다.
//https://dahye-jeong.gitbook.io/java/java/undefined/java-nested

public class G {
	// 인스턴스 필드
	B field1 = new B(); // =>(O)
	C field2 = new C(); // =>(O)

	// 인스턴스 메소드
	void method1() {
		B var1 = new B(); // =>(O)
		C var2 = new C(); // =>(O)
	}

	// 정적 필드 초기화
	static B field3 = new B(); // =>(X)
	static C field4 = new C(); // =>(O)

	// 정적 메소드
	static void method2() {
		B var1 = new B(); // =>(X)
		C var2 = new C(); // =>(O)
	}

	// 인스턴스 멤버 클래스
	class B {
	}

	// 정적 멤버 클래스
	static class C {
	}
}

