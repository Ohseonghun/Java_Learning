package APIString;
//바이트 배열로 변환(getBytes())
//네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다.

public class 바이트배열로변환 {
	byte[] bytes = "문자열".getBytes();
	
//	시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴한다. 
//	만약 특정 문자셋으로 인코딩된 바이트 배열을 얻으려면 다음 메소드를 사용하면된다.
	
	byte[] bytes = "문자열".getBytes(Charset charset);
	byte[] bytes = "문자열".getBytes("UTF-8");
//	여기서 EUC-KR은 한글 2byte, UTF-8은 3byte로 변환한다.
//	시스템 기본 문자셋과 다른 문자셋으로 인코딩된 바이트 배열일 경우 다음 String 생성자를 이용해 디코딩 할 수 있다.
	
	String str = new String(byte[] bytes,String charsetName);
//	getBytes(Charset charset) 메소드는 잘못된 문자셋을 매개값으로 줄 경우 
//	UnsupportedEncodingException예외가 발생하므로 다음과 같이 예외처리가 필요하다.
	try{
	    byte[] bytes = "문자열".getBytes("UTF-8");
	}catch(UnsupportedEncodingException e){
	    e.printStackTrace();
	}
}
