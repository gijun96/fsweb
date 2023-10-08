package exam;

import java.util.Scanner;

public class exam_43 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("숫자를 입력해주세요.");
      String str = scanner.nextLine();
      if(str.indexOf("-", 0) != -1 || str.length() >8) {
          System.out.println("숫자를 다시 입력해주세요.");
          continue;
      }
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
          switch (arr[i]) {
            case '1':
              arr[i] = '일';
              break;
            case '2':
              arr[i] = '이';
              break;
            case '3':
              arr[i] = '삼';
              break;
            case '4':
              arr[i] = '사';
              break;
            case '5':
              arr[i] = '오';
              break;
            case '6':
              arr[i] = '육';
              break;
            case '7':
              arr[i] = '칠';
              break;
            case '8':
              arr[i] = '팔';
              break;
            case '9':
              arr[i] = '구';
          }

          if (i == arr.length - 2 || i == arr.length - 6) System.out.print(arr[i] + "십");
          else if (i == arr.length - 3 || i == arr.length - 7) System.out.print(arr[i] + "백");
          else if (i == arr.length - 4 || i == arr.length - 8) System.out.print(arr[i] + "천");
          else if (i == arr.length - 5){ System.out.print(arr[i] + "만");
          }else System.out.println(arr[i]);
        }
      System.out.println("숫자 출력을 마칩니다.");
        break;
      }
    }
  }
