package clone_객체복제;
//객체 복제는 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것을 말한다.
//객체를 복제하는 이유는 원본 객체를 안전하게 보호하기 위해서이다.
//
//얕은 복제(this clone) : 단순히 필드값을 복사해서 객체를 복제하는 것을 말한다.
//
//Object의 clone()메소드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
//이 메소드로 복제를 하려면 원본 객체는 반드시 java.lang.Cloneable인터페이스를 가지고 있어야한다.
//메소드 선언이 없음에도 불구하고 Cloneable 인터페이스를 명시적으로 구현하는 이유는 
//클래스 설계자가 복제를 허용한다는 의도적인 표시를 하기 위해서이다.


class Member implements Cloneable{
	//implments를 사용하여 복사를 허용 함
	
    public String id;
    public String name;
    public String passwd;
    public int age;
    public boolean adult;

    public Member(String id, String name, String passwd, int age, boolean adult){
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.age = age;
        this.adult = adult;
    }

    public Member getMember(){
        Member cloned = null;
        try{
            cloned = (Member)clone();
            //clone()메소드의 리턴타입은 Object이므로 Member타입으로 casting
        }catch(CloneNotSupportedException e){}
        return cloned;
    }
}

public class clone extends Member {
	public void main(String[] args) {
		
		//원본 객체 생성
		Member Original = new Member ("blue", "홍길동", "12345", "25", true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member clond = Original.getMember();
		cloned.password = "67890";
		
		
	}

	
}
