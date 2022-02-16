package StringTokenizer_문자열개체화;
//문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스입니다. 

//그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부릅니다.

//int countTokens() 
//남아있는 token의 개수를 반환합니다

//boolean hasMoreElements(), boolean hasMoreTokens()
//다음의 token을 반환합니다. 
//StringTokenizer는 내부적으로 어떤 위치의 토큰을 사용하였는지 기억하고 있고
//그 위치를 다음으로 옮깁니다. 두가지 메소드는 모두 같은 값을 반환합니다.

//Object nextElement(), String nextToken()
//이 두가지 메소드는 다음의 토큰을 반환합니다. 
//두가지 메소드는 같은 객체를 반환하는데 반환형은 다릅니다. 
//nextElement는 Object를, nextToken은 String을 반환하고 있습니다.

/////String 클래스에 있는 split 메소드 이용/////
public class StringTokenizer {
	public static void main(String[] ar) {
		String str = "this string includes default delims";
		System.out.println(str);
		System.out.println();

		System.out.println("==========using split method============");
		String[] tokens = str.split(" ");

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
//String클래스의 메소드인 split 메소드를 사용하여 StringTokenizer를 흉내낼 수 있습니다. 
//split이 반환하는 값은 String 배열입니다.
		}
	}
}

/////Default Delim을 이용/////
public class StringTokenizer1 {
	public static void main(String[] ar) {
		String str = "this string\tincludes\ndefault delims";
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println(str);
		System.out.println();

		System.out.println("total tokens:" + stk.countTokens());
		System.out.println("================tokens==================");
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		System.out.println("total tokens:" + stk.countTokens());
//코드의 while문을 보면 토큰이 있는지 확인한 후 있다면 다음 토큰을 가져옵니다. 
//이렇게 하나씩 토큰을 소비한다고 보면되는데, 이런 패턴이 StringTokenizer를 사용하는 가장 일반적인 사용방법입니다.
	}
}

/////특정 Delim을 이용/////
public class StringTokenizer2 {
	public static void main(String[] ar) {
		String str = "this-=string-includes=delims";
		StringTokenizer stk = new StringTokenizer(str, "-=");
		System.out.println(str);
		System.out.println();

		System.out.println("total tokens:" + stk.countTokens());
		System.out.println("================tokens==================");
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		System.out.println("total tokens:" + stk.countTokens());
//특정 delim으로 문자열을 분리하는 예제입니다. 여기서는 "-"와 "="으로 분리를 했네요.
	}
}

/////Delim까지 포함/////
public class StringTokenizer3 {
	public static void main(String[] ar){
		String str="this-string-includes=delims";
		StringTokenizer stk=new StringTokenizer(str,"-=",true);
		System.out.println(str);
		System.out.println();
			
		System.out.println("total tokens:"+stk.countTokens());
		System.out.println("================tokens==================");
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
		System.out.println("total tokens:"+stk.countTokens());
//위의 예제의 생성자에서 세번째 인자를 true로 전달했을때의 예제입니다. 
//이때 "-"와 "="를 토큰으로 포함하게 됩니다. 이 예제에서 true를 전달하지 않고 
//false로 전달한다면 위의 예제와 같은 결과가 나오게 됩니다.
	}
}
