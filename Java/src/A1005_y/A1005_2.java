package A1005_y;

public class A1005_2 {
    public static void main(String[] args) {

        String ssn = "9506241239123";
        int length = ssn.length();
        if(length == 13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }

    }
}
