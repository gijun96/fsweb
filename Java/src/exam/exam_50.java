package exam;

import java.util.Scanner;

public class exam_50 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("BMI를 입력하세요.");
        float bmi = scanner.nextFloat();
        if (bmi <18.5f) System.out.println("저체중입니다.");
        else if (bmi >= 18.5f && bmi <= 23) {
            System.out.println("정상체중 입니다.");
        } else{
            System.out.println("비만입니다.");

        }


    }
    }

