package Switch문;

//switch/case 문은 if 문과 비슷하지만 좀 더 정형화된 조건 판단문이다.

public class SwitchCase {
    public static void main(String[] args) {
        int month = 8;
        
        String monthString = "입력 창";
        
        //입력변수의 값과 일치하는 case 입력값값이 있다면 해당 case문에 속한 문장들이 실행된다. 
        //입력값이 정형화되어 있는 경우 if문보다는 switch/case문을 쓰는것이 가독성에서 좀 더 유리하다.
        
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}

