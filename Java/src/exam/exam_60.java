package exam;

import java.util.Scanner;

public class exam_60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("터널1의 높이를 입력하세요.");
       int t1 =scanner.nextInt();
        System.out.println("터널2의 높이를 입력하세요.");
        int t2 =scanner.nextInt();
        System.out.println("터널3의 높이를 입력하세요.");
        int t3 =scanner.nextInt();

        int[] t = {t1, t2, t3};
        String result = "";
        int crush_val= 0;

        for (int i= 0; i<t.length;i++){
            if (t[i] <= 170 && crush_val ==0){
                result = "CRASH";
                crush_val = t[i];
            }
            System.out.println(t[i]);
        }
        System.out.printf("%s\t%d\n", result, crush_val);
    }
}



