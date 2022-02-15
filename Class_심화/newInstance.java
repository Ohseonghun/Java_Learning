package Class_심화;
//동적 객체 생성(newInstance())

//자바의 새로운 객체를 생성하기 위해 new라는 연사자를 많이 사용했을 것이다.
//Class 객체를 이용하면 new 연산자를 사용하지 않아도 동적으로 객체를 생성할 수 있다.
//이 방법은 런타임 시에 클래스 이름이 결정되는 경우에 매우 유용하게 사용된다.

interface Info {
	public void myInfo();
}

class BodyInfo implements Info {
	@Override
	public void myInfo() {
		System.out.println("나의 키는 200cm");
		System.out.println("나의 몸무게는 100kg");
	}
}

class PersonalInfo implements Info {
	@Override
	public void myInfo() {
		System.out.println("나의 이름은 aaa");
		System.out.println("나의 나이는 25세");
	}
}

public class newInstance {
	public static void main(String[] args) {
		try {
			Class clazz1 = Class.forName("NewInstance.BodyInfo");
			//Class.forName으로 구현 클래스를 클래스 객체로 받는다.
			Info info = (Info) clazz1.newInstance();
			// 리턴값이 Object이기 때문에 Info로 한 번 감싸준다.
			info.myInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Class clazz2 = Class.forName("NewInstance.PersonalInfo");
			Info info = (Info) clazz2.newInstance();
			// 리턴값이 Object이기 때문에 Info로 한 번 감싸준다.
			info.myInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 예외의 경우 ClassNotFoundException / InstantiationException /
		// IllegalAccessException 들이 발생할 수 있음
		// 근데 한번에 처리하기 위해서 그냥 Exception을 넣음 } }
	}
}
