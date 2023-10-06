package exam;

import java.util.Scanner;

public class exam_39 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] n = new int[3];
        int max =0;
        int min =0;
        for(int i =0; i<n.length;i++){
            System.out.println("n["+i+"]의 값을 입력하세요");
            n[i] = scanner.nextInt();
            min = n[0];
            if (max<n[i]){
                max =n[i];
            } else if (min>n[i]) {
                min =n[i];
            }
        }
        System.out.println("최대값: "+ max);
        System.out.println("최소값: "+min);
    }
}
