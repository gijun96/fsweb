package A1004;

import java.util.Scanner;

public class A1004_test39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a를 입력하세요.");
        int a = scanner.nextInt();
        System.out.print("b를 입력하세요.");
        int b = scanner.nextInt();
        System.out.print("c를 입력하세요.");
        int c= scanner.nextInt();

        if(b>a && c>a){
            System.out.println("가장 적은 값: "+a);
        }else if(a>b && c>b){
            System.out.println("가장 적은 값: "+b);
        }else if(a>c && b>c){
            System.out.println("가장 적은 값: "+c);
        }

    }
}
