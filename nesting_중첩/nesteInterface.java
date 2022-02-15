package nesting_중첩;

import nesting_중첩.Button.OnClickLister;

//중첩 인터페이스는 클래스 내부에 선언한 인터페이스이다.
//중첩 인터페이스는 주로 UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용된다.

public class nesteInterface {
	interface I {
		void method();
	}
}

///UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용된다.///
public class Button{
    // 인터페이스 타입 필드
    OnClickListener listener;

    // 매개 변수의 다형성
    void setOnClikcListener(OnClickListenr listener){
        this.listener = listener;
    }

    void touch(){
        // 구현 객체의 onClick()메소드 호출
        listener.onClick();
    }

    // 중첩 인터페이스
    interface OnClickLister{
        void onClick();
    }
}

//아무 객체를 받으면 안되고, Button 내부에 선언된 중첩 인터페이스를
//구현한 객체만 받아야하는 것을 코드로 구현해 보았다.

public class CallListener implements OnClickLister{
    @Override
    public void onClick(){
        System.out.println("전화를 겁니다.");
    }
}

public class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick(){
        System.out.println("메세지를 보냅니다.");
    }
}