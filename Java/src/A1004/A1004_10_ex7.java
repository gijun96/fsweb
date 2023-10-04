package A1004;

import java.util.Scanner;

public class A1004_10_ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int value = 0;

        while(run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            String strNum = scanner.nextLine();
            if (strNum.equals("1")) {
//            예금
                System.out.print("예금액>");
//                String valNum = scanner.nextLine();
//                value += Integer.parseInt(valNum);
                value += Integer.parseInt(scanner.nextLine());
            } else if (strNum.equals("2")) {
//            출금
                System.out.print("출금액>");
//                String valNum = scanner.nextLine();
//                value -= Integer.parseInt(valNum);
                value -= Integer.parseInt(scanner.nextLine());
            } else if (strNum.equals("3")) {
//              잔고
                System.out.println("잔고>" + value + "원");
            }else if (strNum.equals("4")){
                run = false;
                System.out.println("");
                System.out.println("프로그램 종료");
            }
        }
        scanner.close();
    }
}
