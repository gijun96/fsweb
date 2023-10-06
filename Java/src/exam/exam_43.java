package exam;

import java.util.Scanner;

public class exam_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        for(int i =0; i<str.length();i++) {
            switch(arr[i]){
                case '1':
                    arr[i]='일';
                    break;
                case '2':
                    arr[i]='이';
                    break;
                case '3':
                    arr[i]='삼';
                    break;
                case '4':
                    arr[i]='사';
                    break;
                case '5':
                    arr[i]='오';
                    break;
                case '6':
                    arr[i]='육';
                    break;
                case '7':
                    arr[i]='칠';
                    break;
                case '8':
                    arr[i]='팔';
                    break;
                case '9':
                    arr[i]='구';
            }

            if (i == arr.length-2)System.out.print(arr[i]+"십");
            else if(i == arr.length-3) System.out.print(arr[i]+"백");
            else if(i == arr.length-4) System.out.print(arr[i]+"천");
            else if(i ==arr.length-5){
                System.out.print(arr[i]+"만");
                if(i == arr.length-7)System.out.print(arr[i]+"십");
                    else if(i == arr.length-8) System.out.print(arr[i]+"백");
                    else if(i == arr.length-9) System.out.print(arr[i]+"천");
            }else System.out.print(arr[i]);
        }
        }

    }

