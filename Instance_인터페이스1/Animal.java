package Instance_인터페이스1;

class Animal {
    String name;
//클래스에 선언된 변수를 객체 변수 라고 한다. 
//객체 변수는 인스턴스 변수, 멤버 변수, 속성이라고도 한다.
    
    public void setName(String name) {
    	this.name =name;
    	
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}
