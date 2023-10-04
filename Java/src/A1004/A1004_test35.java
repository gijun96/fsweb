package A1004;

import java.util.Scanner;

public class A1004_test35 {
    public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    int num = scanner.nextInt();
    int sum =0;
    for (int i =1; i<=num;i++){
        if (i%2 ==0){
            sum +=i;
        }
    }
        System.out.println("num 까지의 짝수의 합 : "+ sum);

    }
}
