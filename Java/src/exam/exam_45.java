package exam;

import java.util.Scanner;

public class exam_45 {
    public static void main(String[] args) {
//2차 방정식의 해
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("a의 값을 입력하세요.");
            int a = scanner.nextInt();
            if ( a ==0){
                System.out.println("a는 0이 될수 없습니다..");
                continue;
            } else if (a >10 || a < -10) {
                System.out.println("a는 -10보다 크거나 같고 10보다 작거나 같습니다.");
                continue;
            }
            System.out.println("b의 값을 일력하세요.");
            int b = scanner.nextInt();
            if (b >10 || b < -10) {
                System.out.println("a는 -10보다 크거나 같고 10보다 작거나 같습니다.");
                continue;
            }
            System.out.println("c의 값을 입력하세요.");
            int c = scanner.nextInt();
            if (c >10 || c < -10) {
                System.out.println("a는 -10보다 크거나 같고 10보다 작거나 같습니다.");
                continue;
            }


            double d = Math.pow(b ,2)-(4*a*c);
            System.out.println(d);
            double x1 = (-b + Math.sqrt(d))/ 2*a;
            double x2 = (-b - Math.sqrt(d))/ 2*a;

            if (d >0){
                System.out.println("두 개의 서로 다른 실근");
                System.out.printf(" + 연산 : %.2f", x1);
                System.out.printf(" - 연산 : %.2f" ,x2);
            }else if(d ==0){
                System.out.println("서로 같은 두 실근 ->중근");
                System.out.printf("중근 : %.2f ",x1);
            }else if(d< 0){
                System.out.println("서로 다른 두 허근 -> 근이 없음");
            }
            System.out.println("");
            break;
        }
        }

    }

