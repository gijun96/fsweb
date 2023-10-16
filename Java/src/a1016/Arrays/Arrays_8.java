package a1016.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_8 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하세요.");
       int size = scanner.nextInt();
       int[] numbers = new int[size];

       for (int i =0; i <size; i++){
           System.out.println("숫자를 입력하세요.");
           numbers[i] = scanner.nextInt();

       }
        System.out.println("입력한 숫자 배열 : ");
       for (int number : numbers){
           System.out.print(number +" ");
       }
       scanner.close();
    }
}
