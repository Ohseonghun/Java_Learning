package 객체비교;
//https://codechacha.com/ko/java-compare-objects/

public interface Comparable<T> {
    public int compareTo(T o);
  //Comparable 인터페이스를 클래스에 implements하여 비교할 수 있습니다.
  //compareTo()는 비교하는 객체가 같거나, 크거나, 작거나를 비교하여 
  //0, 음수, 양수를 리턴할 수 있습니다.
}


//String을 갖고 있는 Text라는 클래스를 정의하였습니다. 
//Comparable를 compareTo()라는 메소드를 오버라이딩하였습니다.
class Text implements Comparable<Text> {
    private String mText;

    public Text(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }

    @Override
    public int compareTo(Text right) {
        return mText.compareTo(right.getText());
    }
    
}

class text1 {
	
    Text text1 = new Text("aaa");
    Text text2 = new Text("aaa");
    
    //System.out.println(text1.compareTo(text2));
    // 0 출력
    
}