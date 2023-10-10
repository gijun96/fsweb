package exam;

import java.util.Scanner;

public class exam_55 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int score = scanner.nextInt();
        if (score <0 || score>100) System.out.println("점수는 0~100까지 입니다.");

        Grade g = new Grade();
        System.out.println(g.grade(score));
    }
}
    class  Grade {
        char result;
        char grade(int score){
            if (score >=90)result = 'A';
             else if (score >=80) result = 'B';
             else if (score >=70)result = 'C';
            else if(score >=60) result = 'D';
            else result = 'F';
            return result;
        }
            }


