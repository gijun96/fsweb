package exam;

import java.util.Scanner;

public class exam_58 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("a를 입력하세요");
    int a = scanner.nextInt();
        System.out.println("b를 입력하세요");
    int b =scanner.nextInt();
        System.out.println("c를 입력하세요");
    int c = scanner.nextInt();

    if (c < (a+b)){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }

    }
}
