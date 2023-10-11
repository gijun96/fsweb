package exam;

import java.util.Scanner;

public class exam_56 {

    public static void main(String[] args) {
        //윷의 4가지 상태를 입력받는다.
        //0이면 뒤집어지지않은 상태, 1이면 뒤집어진 상태

        Scanner scanner = new Scanner(System.in);
        int[] state= new int[4];
        System.out.println("윷1의 상태를 입력해주세요.");
        state[0] = scanner.nextInt();
        System.out.println("윷2의 상태를 입력해주세요.");
        state[1] = scanner.nextInt();
        System.out.println("윷3의 상태를 입력해주세요.");
        state[2] = scanner.nextInt();
        System.out.println("윷4의 상태를 입력해주세요.");
        state[3] = scanner.nextInt();

        int result =0;
        for (int i= 0;i< state.length-1;i++){
            result += state[i];
        }
//        System.out.println(result);
        if (result ==0) System.out.println("모");
        else if (result ==1) System.out.println("도");
        else if (result ==2) System.out.println("개");
        else if (result ==3) System.out.println("걸");
        else if (result ==4) System.out.println("윷");


    }
}
