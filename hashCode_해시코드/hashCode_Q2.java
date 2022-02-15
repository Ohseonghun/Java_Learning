package hashCode_해시코드;

import java.util.Objects;

////해시 충돌 관리하기////
//아무리 좋은 해시 알고리즘을 사용하더라도 충돌이 발생할 수 있습니다.
//왜냐하면 같은 객체라면 반드시 같은 해시코드 값을 반환해야 하는 것은 당연하지만 
//서로 다른 객체임에도 같은 해시코드 값을 가질 수 있습니다.
//
//충돌이 일어나면 버킷 내부에서 원소들은 리스트의 형태로 저장하게 됩니다. 
//원소 수가 많아질수록 해시 성능이 떨어지게 됩니다.
//
//이를 보완하기 위해 Java 8부터는 버킷 크기가 특정 임계값을 초과하면 
//연결된 목록이 트리 맵으로 바뀝니다. 
//이를 통해 시간복잡도 O(n)에서 O(logn)으로 성능을 올릴 수 있습니다.

class User {

	private long id;
	private String name;
	private String email;

	public User(long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (int) id;
		hash = 31 * hash + (name == null ? 0 : name.hashCode());
		hash = 31 * hash + (email == null ? 0 : email.hashCode());
		System.out.println("hashCode() called - Computed hash: " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return id == user.id && Objects.equals(name, user.name) && Objects.equals(email, user.email);
	} //User 클래스의 hashCode(), equals() 메소드를 오버라이딩 하였습니다.
}

