package exam;

import java.util.Scanner;

public class exam_10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] val = new int[3];
        for(int i =0; i<val.length;i++){
            System.out.println("val[" + i +"]를 입력하세요.");
            val[i] = scanner.nextInt();
        }
        for(int j = 0; j <val.length;j++){
        String result = (val[j]%2 ==0)? "even":"odd";
            System.out.println(result);
        }
    }
}
