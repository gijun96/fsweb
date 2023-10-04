package A1004;

import java.util.Scanner;

public class A1004_test37 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            for (int j =1; j<n;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
