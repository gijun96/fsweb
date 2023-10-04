package A1004;

import java.util.Scanner;

public class A1004_test40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("날아간 공의 거리를 입력하세요");
      float f_val = Float.valueOf(scanner.nextLine());
      if(f_val >=50 && f_val <=60){
          System.out.println("win!!");
      }else{
          System.out.println("lose!");
      }
    }
}
