package ArrayList_Q;


//리스트 (List)
//https://wikidocs.net/207
//리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
//리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다. 배열은 크기가 정해져 있다.
//예를 들어 배열의 크기를 10개로 정했다면 10갸 이상의 값을 담을 수는 없다. 
//하지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다.

public class ArrayList {
	public static void main(String[] args) {

		///////////// ArrayList ///////////
		// List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다.

		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");

		System.out.println(pitches.get(1)); // 123
		// ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.

		System.out.println(pitches.size());
		// 위 코드를 실행하면 pitches에 담긴 갯수가 출력된다.

		
		System.out.println(pitches.contains("142"));
		//pitches 객체는 142 값을 포함하고 있으므로 true가 출력된다.
		
		System.out.println(pitches.remove("129"));
		//
	}

}