package exam;

import java.util.Scanner;

public class exam_48 {
    public static void main(String[] args) {
        int year = 2012;
        Scanner scanner= new Scanner(System.in);
        while(true) {
            System.out.println("주민번호 앞 7자리를 입력해주세요.(ex/ 790101)");
            String str = scanner.nextLine();
            char[] arr = str.toCharArray();
            String [] rel = new String[3];
            if (arr[arr.length-1] =='1' || arr[arr.length-1] =='2') rel[0] = "19";
            else if (arr[arr.length-1] =='3' || arr[arr.length-1] =='4') rel[0] = "20";
            rel[1] = String.valueOf(arr[0]);
            rel[2] = String.valueOf(arr[1]);
            int bir = Integer.parseInt(rel[0]+rel[1]+rel[2]);
            System.out.println((year+1) - bir);
            System.out.println("===종료===");
             break;
        }




    }
    }

