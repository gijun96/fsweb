package exam;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exam_59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = new String[6];
        System.out.println("로또 당첨 번호 6자리를 입력해주세요.");
        for (int i = 0; i < num.length; i++) {
            String n = scanner.nextLine();
            num[i] = n;


//        System.out.println(num[i]);
        }
        System.out.println("보너스번호를 입력해주세요.");
        String bonus_n = scanner.nextLine();

        String[] user_num = new String[6];
        System.out.println("당신의 당첨번호를 입력해주세요.");
        for (int j = 0; j < user_num.length; j++) {
            int user_n = scanner.nextInt();
            user_num[j] = String.valueOf(user_n);
//            System.out.println(user_num[j]);
        }
        int result = 0;
        int result_b = 0;
        for (int i = 0; i < user_num.length; i++) {
            if (num[i].equals(user_num[i]))result += 1;
            if (user_num[i].equals(bonus_n))result_b +=1;
        }
//        System.out.println(result);

        if (result == 6) System.out.println("1등!");
        else if (result == 5) {
            if (result_b ==1) {
                System.out.println("2등!");
            } else {
                System.out.println("3등");
            }

        } else if (result == 4) System.out.println("4등!");
        else if (result == 3) System.out.println("5등!");
        else System.out.println("꽝!");
        System.out.println();
    }
}
