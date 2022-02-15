package Exception예외처리;
//https://wikidocs.net/229

public class RuntimeExeption {
	
	public class Sample {
	    public void sayNick(String nick) {
	        if("fool".equals(nick)) {
	            return;
	          //return 으로 메소드를 종료해 별명이 출력되지 못하도록 하고 있다.
	        }
	        System.out.println("당신의 별명은 "+nick+" 입니다.");
	    }

	    public static void main(String[] args) {
	        Sample sample = new Sample();
	        sample.sayNick("fool");
	        sample.sayNick("genious");
	    }

	}
	
	//"fool" 문자열이 입력되면 단순히 return으로 종료하지 말고 적극적으로 예외를 발생시켜 보자.
	class FoolException extends RuntimeException {
	} //다음과 같은 FoolException 클래스를 Sample.java 파일에 작성하자.

	public class Sample1 {
	    public void sayNick(String nick) {
	        if("fool".equals(nick)) {
	            throw new FoolException();
	        }
	        System.out.println("당신의 별명은 "+nick+" 입니다.");
	    }

	    public static void main(String[] args) {
	        Sample sample = new Sample();
	        sample.sayNick("fool");
	        sample.sayNick("genious");
	    }
	}
//	프로그램을 실행하면 "fool"이라는 입력값으로 sayNick 메소드 실행시 예외가 발생한다.
	//Exception in thread "main" FoolException
    //at Sample.sayNick(Sample.java:7)
    //at Sample.main(Sample.java:14)
	
}

//untimeException은 실행시 발생하는 예외이고 Exception은 컴파일시 발생하는 예외이다.
//즉, Exception은 프로그램 작성시 이미 예측가능한 예외를 작성할 때 사용하고
//RuntimeException은 발생 할수도 발생 안 할수도 있는 경우에 작성한다.


//다음과 같이 변경해야 정상적으로 컴파일이 될 것이다.
class FoolException extends Exception {
}

public class Sample {
    public void sayNick(String nick) {
        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }//sayNick 메소드에서 try... catch 문으로 FoolException을 처리했다.

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("fool");
        sample.sayNick("genious");
    }
}
