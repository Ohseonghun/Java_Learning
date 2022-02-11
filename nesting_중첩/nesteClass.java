package nesting_중첩;

//객체 지향 프로그램에서 클래스들은 서로 긴밀한 관계를 맺고 상호작용을 한다.
//클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나,
//특정 클래스와 관계를 맺을 경우에는 관계 클래스를 클래스 내부에 선언하는 것이 좋다.

//https://dahye-jeong.gitbook.io/java/java/undefined/java-nested
public class nesteClass {

}

/////중첩 클래스/////
class ClassName {
	class NestedClassName {
		// 중첩 클래스란 클래스 내부에 선언한 클래스를 말한다.
	}
}

class A {
	class B{...}
	// 멤버 클래스 : 클래스의 멤버로서 선언
	// 클래스나 객체가 사용 중이라면 언제든지 재사용 가능
	// 인스턴스 멤버 클래스 : A 객체를 생성해야만 사용할 수 있는 B 중첩 클래스

	static class C{...}
	// 정적 멤버 클래스 : A클래스로 바로 접근할 수 있는 C 중첩 클래스
}

class D {
	void method(){
        class E{...}
        //로컬 클래스 : 메소드 내부에서 선언
        //메소드 실행 시에만 사용되고, 메소드 실행이 종료되면 없어진다.
    }
}

//////인스턴스 멤버 클래스/////


class ClassName1 {
	interface NestedInterfaceName {
//중첩 인터페이스는 클래스 내부에 선언한 인터페이스이다.
//중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용된다.
	}
}