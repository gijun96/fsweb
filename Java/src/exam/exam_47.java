package exam;

import java.util.Scanner;

public class exam_47 {
    public static void main(String[] args) {
//윤년 판별
//        2월이 29일 까지 있는 해를 윤년이라고 함.
//        입력된 년도가 윤년인지 아닌지 판별하시오.

        Scanner scanner =new Scanner(System.in);
        System.out.println("윤년을 판별할 연도를 입력해주시요.");

//        윤년 판별 조건
//        1. 해가 4의 배수 이면서 100의 배수가 아니면 윤년
//        2. 400의 배수이면 윤년
//        두 조건중 하나라도 충족하면 윤년
        int year = scanner.nextInt();
        if(year%4 ==0 && year%100 !=0){
            System.out.println("YES! 윤년입니다.(1번 조건)");
        } else if (year%400 ==0) {
            System.out.println("YES! 윤년입니다.(2번 조건)");
        }else{
            System.out.println("NO! 윤년이 아닙니다.");
        }
    }
    }

