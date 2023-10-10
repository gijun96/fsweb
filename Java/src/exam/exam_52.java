package exam;

import java.util.Scanner;

public class exam_52 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.\n 숫자는 1~100까지 입니다.");
        int num = scanner.nextInt();
        if (num<100 || num <0) System.out.println("숫자를 확인해주세요.");
        int[] st = {1, 21, 31, 41, 51, 61, 71, 81, 91};
        int[] nd = {2, 22, 32, 42, 52, 62, 72, 82, 92};
        int[] rd = {3, 23, 33, 43, 53, 63, 73, 83, 93};
        String unit = "";
        for(int i =0; i< st.length;i++){
            if(num == st[i]){
                unit ="st";
                break;
            }else if(num == nd[i]){
                unit ="nd";
                break;
            }else if (num == rd[i]){
                unit ="rd";
                break;
            }else{
                unit ="th";
            }
        }
        System.out.println(num+unit);
    }
}
