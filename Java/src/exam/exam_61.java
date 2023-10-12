package exam;

import java.util.Scanner;

public class exam_61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a를 입력하세요.");
        int a = scanner.nextInt();
        System.out.println("연산자를 입력하세요.");
        String str = scanner.next();
        System.out.println("b를 입력하세요.");
        int b =scanner.nextInt();

        int result =0;
        switch (str){
            case "+":
                result = a+ b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
        }
        System.out.printf("%d %s %d = %d", a, str, b, result);

    }
}



