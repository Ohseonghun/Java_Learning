package Class_심화;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//특정 인스턴스가 가지고 있는 값을 가져오는 것이기 때문에 인스턴스가 필요하다.
//Field.get(object)
//Filed.set(object, value)
//Static 필드를 가져올 때는 object가 없어도 되니까 null을 넘기면 된다.

public class ClassInstance {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> bookClass = Class.forName("kr.co.study.Book");
		//파라메터가 없는 생성자 가져오기
		Constructor<?> constructor = bookClass.getConstructor(null);
		//Book 의 인스턴스 생성
		Book book = (Book) constructor.newInstance();
		System.out.println("book 이 제대로 생성되었는가?" +  book);
		
		//파라메터가 있는 생성자 가져오기
		Constructor<?> constructor2 = bookClass.getConstructor(String.class);
		Book book2 = (Book) constructor2.newInstance("myBook");
		System.out.println("book2 이 제대로 생성되었는가?" +  book2);
		
		
		//A필드에잇는 값 가져오기
		Field a = Book.class.getDeclaredField("A");
		System.out.println(a.get(null));
		a.set(null, "AAAAAA");
		System.out.println(a.get(null));
		
		//B라는 필드의 값을 가져오기
		Field b = Book.class.getDeclaredField("B");
		//private으로 접근자가 설정되어있어서
		b.setAccessible(true);
		System.out.println(b.get(book));
		b.set(book, "BBBBBBBBBBBB");
		System.out.println(b.get(book));
		
		//private로 된 메소드 가져오기
		Method privateMethod = Book.class.getDeclaredMethod("c");
		privateMethod.setAccessible(true);
		privateMethod.invoke(book);
		
		//public으로된 메소드 가져오기
		Method publicMethod = Book.class.getDeclaredMethod("sum" , int.class, int.class);
		int invoke= (int)  publicMethod.invoke(book, 1, 3);
		System.out.println(invoke);
	
	}

}

 class Book {
	public static String A = "a";

	private String B = "BOOK";

	public Book() {

	}

	public Book(String b) {
		B = b;
	}

	public void c() {
		System.out.println("C");
	}

	public int sum(int left, int right) {
		return left + right;
	}
}
