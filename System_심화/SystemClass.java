package System_심화;
//자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 JVM위에서 실행된다.
//따라서 운영체제의 모든 기능을 자바 코드로 직접 접근하기 어렵다. 
//하지만 java.lang.System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
//즉, 프로그램 종료, 키보드로 입력, 모니터로 출력, 메모리 정리, 현재시간 읽기 등이 가능하다.
public class SystemClass {
	public void main(String[] args) {
		
		//프로그램 종료
		System.exit(0);
		
		//현재 실행하고 있는 프로세스를 강제종료시킬 때 사용한다.
		
		//쓰레기 수집기 실행
		System.gc();
		
		//메모리가 충분하다면 굳이 GC를 실행할 필요가 없다.
		
		//현재 시각 읽기
		long time = System.currentTimeMillis();
		long time1 = System.nanoTime();
		
		//컴퓨터의 시계로부터 현재 시간을 리턴한다.
		
		//시스템 프로퍼티 읽기
		//String value = System.getProperty(String key);
		
		//시스템 프로퍼티는 JVM이 시작될 때 자동 설정되는 시스템의 속성값을 말한다. 
		//운영체제의 종류, 자바 프로그램을 실행시킨 사용자 아이디, JVM 버전 등등이 여기에 속한다. 
		//시스템 프로퍼티는 키(key)와 값(value)로 구성되어있다.
		
		//환경 변수 읽기
		//String value = System.getenv(String name);
		
		//대부분 운영체제는 실행되는 프로그램들에게 유용한 정보를 제공할 목적으로 환경 변수를 제공한다. 
		//환경 변수는 프로그램상의 변수가 아니라 운영체제에서 이름과 값으로 관리되는 문자열 정보다. 
	}
}
