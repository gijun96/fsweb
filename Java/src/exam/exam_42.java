package exam;

import java.util.Scanner;

public class exam_42 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >=50 && n<=70){
            System.out.println("win");
        }else if(n%6==0){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }


    }
}
