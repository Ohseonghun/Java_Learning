package hashCode_해시코드;

//해시코드는 해시 알고리즘에 의해 생성된 정수 값입니다.

// 해시테이블(HashTable)은 hashCode() 메소드를 사용하여 주어진 키에 대한 해시 값을 계산하고 
//내부적으로 이 값을 사용하여 데이터를 저장하기 때문에 접근할 때 훨씬 더 효율적입니다.

//hashCode()는 어떻게 작동하는가?
//https://devlog-wjdrbs96.tistory.com/243 참조

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class hashCode_Q {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Gyunny", " Java", " Study");
		if (words.contains("Gyunny")) {
			// contains 는 배열값을 검색하는 메소드이다.
			// 만약 리스트 내에 배열이 많다면 엄청 오래 걸릴 것이다.
			// 하지만 HashTable을 사용하면 아주 효과적이다.
			System.out.println("Gyunny Java Love");
		}
	}

}

////잘못된 해시코드(hashCode) 구현////
class User {

	private long id;
	private String name;
	private String email;

	// standard getters/setters/constructors

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		User user = (User) o;
		return id == user.id && (name.equals(user.name) && email.equals(user.email));
	}

	// getters and setters here

//위와 같이 계속 똑같은 해시코드(hashCode) 값을 반환하는 메소드를 사용하면
//해시테이블 하나의 버킷 내에 계속 원소들이 쌓여 리스트 형태로 연결될 것입니다. 
//그러면 해시테이블의 검색 시간복잡도 O(1)의 이점을 누리지 못하고 O(n)으로 늘어나게 됩니다.
}

////해시코드(hashCode) 성능 향상////

class User1 {

	private long id;
	private String name;
	private String email;

	@Override
	public int hashCode() {
		return (int) id * name.hashCode() * email.hashCode();
	}
//위와 같은 hashCode() 메소드는 id, name, email 필드를 곱하여 
//개체의 해시 코드를 계산하기 때문에 이전 것보다 값이 중복될 확률이 훨씬 낮습니다.
}

////표준 hashCode() 구현////

class User2 {

	private long id;
	private String name;
	private String email;

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (int) id;
		hash = 31 * hash + (name == null ? 0 : name.hashCode());
		hash = 31 * hash + (email == null ? 0 : email.hashCode());
		return hash;
	}
}
//해시코드를 위와 같이 사용하는 것이 가장 보편적입니다. 
//IntelliJ를 이용해서 hashCode()를 만들어도 편리하게 
//알아서 만들어주기 때문에 직접 구현하지 않아도 됩니다.

//숫자 31을 곱해주는 이유는 무엇일까?
//    1이 홀수이면서 소수(prime)이기 때문입니다. 
//    만약 이 숫자가 짝수이고 오버플로가 발생한다면 정보를 잃게 됩니다. 
//    2를 곱하는 것은 시프트 연산과 같은 결과를 내기 때문입니다.
//    
//    소수를 곱하는 이유는 전통적으로 그래왔습니다. 
//    그리고 31 숫자는 곱셀을 시프트 연산과 뺄셈으로 대체해 최적화 할 수 있습니다