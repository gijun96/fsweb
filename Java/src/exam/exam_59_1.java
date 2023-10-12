package exam;

import java.util.Scanner;

public class exam_59_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");
        String[] Lotto_n = new String[6];
        for (int i =0; i< 6;i++){
            Lotto_n[i] = str[i];
            System.out.println(Lotto_n[i]);
        }
    }
}



