package exam;

import java.util.Scanner;

public class exam_9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] val = new int[3];
        int sum = 0;
        for(int i=0; i <val.length;i++){
            System.out.println("val[" + i +"]를 입력하세요.");
            val[i] = scanner.nextInt();
            sum += val[i];
        }
        double avg =(double)sum /val.length;
        System.out.println(Math.ceil(avg*100)/100);

//        System.out.println("a를 입력하세요.");
//        int a = scanner.nextInt();
//        System.out.println("b를 입력하세요.");
//        int b = scanner.nextInt();
//        System.out.println("c를 입력하세요.");
//        int c = scanner.nextInt();
//        int sum = a + b + c;
//        System.out.println("a + b + c = " + sum);
//        double avg = (double) sum/3 ;
//        avg = Math.ceil(avg *10)/10;
//        System.out.println("평균 값 : "+avg);
    }
}
