package exam;

import java.util.Scanner;

public class exam_52 {


    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("a를 입력하세요.");
        int  a = scanner.nextInt();
        System.out.println("b를 입력하세요.");
        int b= scanner.nextInt();
        double max =0;
        System.out.printf("%d + %d = %d, ", c.a, c.b, c.plus(a, b));
        System.out.printf("%d + %d = %d", c.b, c.a, c.plus(b, a));
        System.out.println();
        System.out.printf("%d - %d = %d, ", c.a, c.b, c.minus(a ,b));
        System.out.printf("%d - %d = %d", c.b, c.a, c.minus(b , a));
        System.out.println();
        System.out.printf("%d * %d = %d, ", c.a, c.b, c.multiply(a ,b));
        System.out.printf("%d * %d = %d", c.b, c.a, c.multiply(b, a));
        System.out.println();
        System.out.printf("%d / %d = %.2f, ", c.a, c.b, c.divibe(a, b));
        System.out.printf("%d / %d = %.2f", c.b, c.a, c.divibe(b,a));
        System.out.println();

    }


    static class Calculator{
int a;
int b;
        int plus (int a, int b){
            return a +b;
        }
        int minus (int a, int b){
            return a- b;
        }
        int multiply (int a, int b){
            return a *b;
        }
        double divibe (int a, int b){
            return (double) a / b;
        }
    }
}




