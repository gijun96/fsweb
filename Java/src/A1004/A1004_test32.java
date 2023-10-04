package A1004;

import java.util.Scanner;

public class A1004_test32 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        char str = scanner.next().charAt(0);
        switch(str){
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly");
                break;
            default:
                System.out.println("what?");
        }

    }
}
