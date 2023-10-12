package exam;

import java.util.Scanner;
public class exam_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = new String[6];
        //        출력 확인용
        String str1 ="";
        // ==================================LOTTO NUMBER==============================================
        System.out.println("로또 당첨 번호 6개를 입력해주세요.");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1)+" 번째 번호를 입력해주세요.");
            String n = scanner.nextLine().replaceAll("[^0-9]", "");
             Outer: while (true){
                        if(n.isEmpty() || Integer.parseInt(n) > 45 || Integer.parseInt(n) <1) {
                            System.out.println("숫자를 다시입력해주세요.");
                            System.out.println((i + 1) + " 번째 번호를 입력해주세요.");
                            n = scanner.nextLine().replaceAll("[^0-9]", "");
                            continue;
                        }else{
                            for (int j=0; j< num.length;j++){
                                if (n.equals(num[j])){
                                    System.out.println("중복입니다. 다시 입력해주세요.");
                                    n = scanner.nextLine().replaceAll("[^0-9]", "");
                                    continue Outer;
                                }
                            }
                        }
                break ;
            }
            num[i] = n;
//            출력확인용
        str1 +=(num[i] +",");
        }
        System.out.println(str1);
        // ==============================BONUS NUMBER==============================================
        System.out.println("보너스번호를 입력해주세요.");
        String bonus_n = scanner.nextLine().replaceAll("[^0-9]", "");
        Outer: while (true){
                if(bonus_n.isEmpty() || Integer.parseInt(bonus_n) > 45 || Integer.parseInt(bonus_n) <1) {
                    System.out.println("숫자를 다시입력해주세요.");
                    System.out.println("보너스 번호를 다시 입력해주세요.");
                    bonus_n = scanner.nextLine().replaceAll("[^0-9]", "");
                    continue ;
                }else {
                    for (int i=0; i< num.length;i++){
                        if (bonus_n.equals(num[i])) {
                            System.out.println("중복입니다. 번호를 다시 입력해주세요.");
                            bonus_n = scanner.nextLine().replaceAll("[^0-9]", "");
                            continue Outer;
                        }
                    }
            }
            break ;
        }
        String[] user_num = new String[6];
//        출력 확인용
            String str2 ="";
        // ==========================USER NUMBER====================================================
        System.out.println("당신의 당첨번호를 입력해주세요.");
        for (int i = 0; i < user_num.length; i++) {
            System.out.println((i+1)+" 번째 번호를 입력해주세요.");
            String user_n = scanner.nextLine().replaceAll("[^1-9]", "");
            while (true){
                    if(user_n.isEmpty() || Integer.parseInt(user_n) > 45 || Integer.parseInt(user_n) <1) {
                        System.out.println("번호를 다시입력해주세요.");
                        System.out.println((i + 1) + " 번째 자리를 입력해주세요.");
                        user_n = scanner.nextLine().replaceAll("[^0-9]", "");
                        continue;
                }
                break ;
            }
            user_num[i] = user_n;
            //출력 확인용
            str2 +=(user_num[i]+",");
        }
        System.out.println(str2);
        // =========================================================================================
        // 결과 출력
        int result = 0;
        int result_b = 0;
        for (int i = 0; i < user_num.length; i++) {
            for (int j=0;j<user_num.length;j++) {
                if (num[i].equals(user_num[j])) result += 1;
            }
            if (user_num[i].equals(bonus_n))result_b +=1;
        }
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
    }
}



