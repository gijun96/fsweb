package exam;

import java.util.Scanner;

public class exam_43 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("숫자를 입력해주세요.");
//      공백제거하여 str변수에 대입
      String str = scanner.nextLine().replaceAll(" ", "").replaceAll("[^0-9]", "");
        if (Integer.parseInt(str) > 99999 || Integer.parseInt(str) < -99999) {
          System.out.println("n은 -99999보다 크고 99999보다 작습니다.");
          continue;
      }
        char[] arr = str.toCharArray();
      String[] units = {"", "십", "백", "천", "만"};
        for (int i = 0; i < str.length(); i++) {
          switch (arr[i]) {
            case '0':
              arr[i] = '영';
              break;
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
          if (arr[i] == '영') System.out.print(units[0]);
           else {
            if (i == arr.length - 2) System.out.print(arr[i] + units[1]);
            else if (i == arr.length - 3) System.out.print(arr[i] + units[2]);
            else if (i == arr.length - 4) System.out.print(arr[i] + units[3]);
            else if (i == arr.length - 5)System.out.print(arr[i] + units[4]);
            else System.out.print(arr[i]);
          }
        }
      System.out.println();
      System.out.println("숫자 출력을 마칩니다.");
        break;
      }
    }
  }
/*
* import java.util.Scanner;

public class NumberToKorean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("한글로 변환할 수를 입력하세요:");
        int number = scan.nextInt();

        String[] units = {"", "십", "백", "천", "만"};
        String[] digits = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

        String result = "";
        int unitIndex = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                result = digits[digit] + units[unitIndex] + result;
            } else {
                if (!result.isEmpty() && result.charAt(0) != '영') {
                    result = digits[digit] + result;
                }
            }

            number /= 10;
            unitIndex++;
        }

        System.out.println(result);
    }
}
* */