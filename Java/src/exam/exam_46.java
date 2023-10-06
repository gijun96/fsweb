package exam;

import java.util.Scanner;

public class exam_46 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("첫 번째 터널의 높이 : ");
        arr[0] = scanner.nextInt();
        System.out.println("두 번째 터널의 높이 : ");
        arr[1] =scanner.nextInt();
        System.out.println("셋 번째 터널의 높이 : ");
        arr[2] = scanner.nextInt();

        for(int i =0;i<3;i++){
            if(arr[i]>=170){
                System.out.println("PASS");
            }else{
                System.out.println("CRASH");
            }
        }

    }
    }

