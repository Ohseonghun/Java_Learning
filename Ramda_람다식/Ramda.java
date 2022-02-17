package Ramda_람다식;

//프로그래밍 언어에서 사용되는 개념으로 익명 함수(Anonymous functions)를 지칭하는 용어입니다.
//수학에서 사용하는 함수를 보다 단순하게 표현하는 방법입니다.

//람다의 특징
//람다 대수는 이름을 가질 필요가 없다. - 익명 함수 (Anonymous functions)
//두 개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는 람다 대수로 단순화 될 수 있다. - 커링 (Curring)

//장점
//1. 코드의 간결성 - 람다를 사용하면 불필요한 반복문의 삭제가 가능하며 복잡한 식을 단순하게 표현할 수 있습니다.
//2. 지연연산 수행 - 람다는 지연연상을 수행 함으로써 불필요한 연산을 최소화 할 수 있습니다.
//3. 병렬처리 가능 - 멀티쓰레디를 활용하여 병렬처리를 사용 할 수 있습니다.

//단점
//1. 람다식의 호출이 까다롭습니다
//2. 람다 stream 사용 시 단순 for문 혹은 while문 사용 시 성능이 떨어집니다.
//3. 불필요하게 너무 사용하게 되면 오히려 가독성을 떨어 뜨릴 수 있습니다.

public class Ramda {

	int max(int a, int b) {
		return a + b;
	}
	//(a, b) -> a+b

}

//정상적인 유형
() -> {}
() -> 1
() -> { return 1; }

(int x) -> x+1
(x) -> x+1
x -> x+1
(int x) -> { return x+1; }
x -> { return x+1; }

(int x, int y) -> x+y
(x, y) -> x+y
(x, y) -> { return x+y; }

(String lam) -> lam.length()
lam -> lam.length()
(Thread lamT) -> { lamT.start(); }
lamT -> { lamT.start(); }


//잘못된 유형 선언된 type과 선언되지 않은 type을 같이 사용 할 수 없다.
(x, int y) -> x+y
(x, final y) -> x+y  

//구현해야 할 메소드가 한개이므로 Functional Interface이다.
@FunctionalInterface
public interface Math {
  public int Calc(int first, int second);
}

//구현해야 할 메소드가 두개이므로 Functional Interface가 아니다. (오류 사항)
@FunctionalInterface
public interface Math {
  public int Calc(int first, int second);
  public int Calc2(int first, int second);
}
