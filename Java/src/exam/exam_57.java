package exam;

import java.util.Scanner;

public class exam_57 {

    public static void main(String[] args) {
       while(true){
           System.out.println("===================");
           System.out.println("===놋데리아 메뉴판===");
           System.out.println("===================");
           System.out.println("1.치즈버거:400kcal");
           System.out.println("2.야채버거:340kcal");
           System.out.println("3.우유:170kcal");
           System.out.println("4.계란말이:100kcal");
           System.out.println("5.샐러드:70kcal");
           System.out.println("=====================");
           Scanner scanner = new Scanner(System.in);
           System.out.println("첫 번째 메뉴를 선택하여 주세요.");
           String menu1 = scanner.nextLine().replaceAll("[^1-5]", "");
           System.out.println("두 번째 메뉴를 선택하여 주세요.");
           String menu2 = scanner.nextLine().replaceAll("[^1-5]", "");
           int kcal = Kcal.Kcal(Integer.parseInt(menu1))+ Kcal.Kcal(Integer.parseInt(menu2));
           System.out.println("총 칼로리 : "+kcal);
           if (kcal >500) System.out.println("angry");
           else System.out.println("no angry");
          break;
       }

    }
}

 class Kcal{
    static int Kcal(int a){
        int menu_kcal =0;
        switch (a){
            case 1:
                menu_kcal =400;
                break;
            case 2:
                menu_kcal =340;
                break;
            case 3:
                menu_kcal =170;
                break;
            case 4:
                menu_kcal =100;
                break;
            case 5:
                menu_kcal =70;
                break;
        }
        return menu_kcal;
    }
}