package exam;

import java.util.Scanner;

public class exam_62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b= scanner.nextLine();
        String c= scanner.nextLine();
        if (b.length() ==1){
            b = "0"+b;
        }
        if (c.length() ==1){
            c = "00"+c;
        }else if (c.length() ==2){
            c= "0"+c;
        }
        System.out.println(a+b+c);
    }
}
