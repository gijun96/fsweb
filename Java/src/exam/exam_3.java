package exam;

import java.util.Scanner;

public class exam_3 {
    public static void main(String[] args) {
//        상단에 import가 안나올떄는 Alt + Shift + O
        Scanner scanner = new Scanner(System.in);

        while (true){
            String str = scanner.nextLine();
            System.out.println(str);
            if (str.equals("q")){
                System.out.println("시스템이 종료됩니다.");
                break;
            }
        }
    }
}
