package toString_Q;

public class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(String company, String os) {
	 this.company = company;
	 this.os = os;
 }
	@Override //String 재정의
	public String toString() {
		return company + ", " +os;
	}
}

 class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
		//myPhone.String() 을 자동 호출 해서 리턴 값을 얻은 후 출력
		//구글, 안드로이드 출력
	}
}
