package Collections_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//기본 자료형을 정렬하는 것이 아닌 우리가 만든 클래스의 
//객체를 정렬하려는 상황이 발생한다면 어떻게 하면 좋을까요?

public class Collections_정렬2 {

	public static void main(String[] ar){
		List<User> list=new ArrayList();
		
		list.add(new User("A",40));
		list.add(new User("B",25));
		list.add(new User("C",10));
		list.add(new User("D",30));
		list.add(new User("E",26));
		
		System.out.println("정렬 전 ->"+list);
		Collections.sort(list,new UserComparator());
		//list.sort(new UserComparator()); 이 방법 역시 정렬 방법
		System.out.println("정렬 후->"+list);
	}
}

class User{
	public String name;
	public int age;
	public User(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString(){
		return "(name:"+name+", age:"+age+")";
	}
}

//Comparator 구현
//compare는 2개의 인자를 받는데 이 인자들은 우리가 앞서 구현했던 User객체입니다. 
//만약 a라는 객체가 b라는 객체보다 더 크다면 1, 작다면 -1, 같다면 0을 반환하도록 합니다. 
//이게 오름차순의 방법이고, 만약 내림차순으로 구현하고 싶다면 반대로 구현

class UserComparator implements Comparator<User>{
	@Override
	public int compare(User a,User b){
		if(a.age>b.age) return 1;
		if(a.age<b.age) return -1;
		return 0;
	}
}