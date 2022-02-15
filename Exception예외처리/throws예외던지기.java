package Exception예외처리;
// sayNick을 호출한 곳에서 FoolException을 처리하도록 예외를 위로 던질 수 있는 방법이 있다.

public class throws예외던지기 {
	public class Sample {
	    public void sayNick(String nick) throws FoolException {
	    	//throws 라는 구문을 이용하여 FoolException을 위로 보낼 수가 있다.
	    	
	        try {
	            if("fool".equals(nick)) {
	                throw new FoolException();
	            }
	            System.out.println("당신의 별명은 "+nick+" 입니다.");
	        }catch(FoolException e) {
	            System.err.println("FoolException이 발생했습니다.");
	        }
	    }

	    public static void main(String[] args) {
	        Sample sample = new Sample();
	        sample.sayNick("fool");
	        sample.sayNick("genious");
	    }
	}
//sayNick 메소드를 변경하면 main 메소드에서 컴파일 에러가 발생할 것이다. 
//hrows 구문 때문에 FoolException의 예외를 처리해야 하는 대상이 sayNick 메소드에서 
//main 메소드로 변경되었기 때문이다.
}

//따라서 컴파일 오류를 해결하려면 다음과 같이 main 메소드를 변경해야 한다.

class FoolException extends Exception {
}

public class Sample1{
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            sample.sayNick("fool");
            sample.sayNick("genious");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        } //main 메소드에서 try... catch로 sayNick 메소드에 대한 FoolException 예외를 처리하였다.
    }
}
