package exam;

import java.util.Scanner;

public class exam_66 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int sum =0;
//
//        for (int i = 0; i<1000; i++){
//            sum += i;
//            if (num <= sum){
//                break;
//            }
//        }
        int i =0;
        while(true){
            sum+= i++;
            if (num <=sum){
                break;
            }
        }
        System.out.printf("입력된 값: %d ,결과값: %d", num, sum);
    }
}
