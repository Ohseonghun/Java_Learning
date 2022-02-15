package HashSet_해시셋;
//HashSet은 Set 인터페이스를 구현하고 있는 가장 대표적인 클래스입니다.
//HashSet 클래스가 내부적으로 어떻게 동작하고 어떤 API들이 있는지에 대해서 알아보자.
//
//Set의 특징
//중복되지 않은 원소들을 저장하고 null을 허용합니다.
//내부적으로 Map을 사용합니다.
//순서를 유지하지 않습니다.
//Thread-Safe 하지 않습니다.
//https://devlog-wjdrbs96.tistory.com/242?category=882228

public class HashSet<E>
extends AbstractSet<E>
implements Set<E>, Cloneable, java.io.Serializable
{
private transient HashMap<E,Object> map;

private static final Object PRESENT = new Object();

public HashSet() {
    map = new HashMap<>();
}
}