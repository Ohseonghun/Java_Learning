package clone_객체복제;
//깊은 복제(deep clone) 
//얕은 복제의 참조 타입 필드는 번지만 복제되기 때문에
//원본 객체의 필드와 복제 객체의 필드는 같은 객체를 참조하게 된다. 
//만약 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지게 된다. 
//깊은 복제란 참조하고 있는 객체도 복제하는 것을 말한다.
//
//깊은 복제를 하려면 Object clone()메소드를 재정의해서 참조 객체를 복제하는 코드를 직접 작성해야한다.

public class DeepClone {
	
	public class Member implements Cloneable{
	    public String name;
	    public int age;
	    // 아래 두개 참조 타입 필드
	    public int[] scores;
	    public Car car;

	    public Member(String name, int age,int[] scores, Car car){
	        this.name = name;
	        this.age = age;
	        this.scores = scores;
	        this.car = car;
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException{
	        Member cloned = (Member)super.clone();
	        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
	        cloned.car = new Car(this.car.model);
	        return cloned;
	    }

	    public Member getMember(){
	        Member cloned = null;
	        try{
	            cloned = (Member)clone();
	            //clone()메소드의 리턴타입은 Object이므로 Member타입으로 casting
	        }catch(CloneNotSupportedException e){
	            e.printStackTrace();
	        }
	        return cloned;
	    }
	}
}
