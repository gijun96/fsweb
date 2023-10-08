package exam;

import java.util.Scanner;

public class exam_49 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력하세요.");
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        System.out.println("현재 시간 : " + hour +":"+ min);
        if(min >=30){
            min -=30;
        }else{
            hour -=1;
            min +=30;
        }

        System.out.println("30분 전 : " + hour +":"+ min);



    }
    }

