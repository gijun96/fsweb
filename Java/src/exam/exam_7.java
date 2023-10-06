package exam;

import java.util.Scanner;

public class exam_7 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("몇 시?");
        int hour = scanner.nextInt();
        System.out.println("몇 분?");
        int min =scanner.nextInt();
        System.out.println(hour+":"+min);

    }
}
