package APIString;
//자주 쓰는 생성자
//네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을 문자열로 변환하기 위해 사용한다.

//배열 전체를 String 객체로 생성
String str = new String(byte[] bytes);
//지정한 문자셋으로 디코딩
String str = new String(byte[] bytes, String charsetName);

//배열의 offset 인덱스 위치부터 length만큼 String 객체 생성
String str = new String(byte[] bytes,int offset, int length);
// 지정한 문자셋으로 디코딩
String str = new String(byte[] bytes, ,int offset, int length,String charsetName);

//키보드로부터 입력받는 문자열에는 엔터키를 눌렀다면 \r, \n의 코드값이 바이트 배열에 저장된다.
//영어는 1byte, 다른 나라 언어는 2byte로 표현되기 때문에 입력된 문자 수와 바이트 수가 다를 수 있다.


public class 생성자 {
	public static void main(String[] args){
	    byte[] bytes = new byte[100];

	    System.out.println("입력 : ");
	    int readByteNo = System.in.read(bytes);
	    String str2 = new String(bytes,0,readByteNo-2);
	    System.out.println(str2);
	}

}

