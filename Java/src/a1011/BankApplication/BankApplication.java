package a1011.BankApplication;

import a1011.SingtonPersonTest.Person;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("================================================");
            System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("================================================");
            System.out.print("선택>");
            String select = scanner.nextLine();
            switch (select){
                // 1. 계좌 생성
                case "1":
                    System.out.print("계좌번호>");
                    String _acc = scanner.nextLine();
                    System.out.print("계좌주");
                    String _name = scanner.nextLine();
                    System.out.print("초기 입급액");
                    String _money = scanner.nextLine();
                    break;
//               2. 계좌목록
                case "2":
                    System.out.println("--------------");
                    System.out.println("   계좌 목록   ");
                    System.out.println("--------------");
                    for (int i =0; i < Bank.count;i++){
                        System.out.println(Bank.accArr[i]);
                    }
                    break;
                //3. 예금
                    //계좌번호, 금액을 받아 해당 계좌번호를 가진 Account에 금액 추가
                case "3":
                    break;
                // 4.출금
                    //계좌번호, 금액을 받아 해당 계좌번호를 가진 Account에 긍액 제거
                case "4":
                    break;
                //5.종료
                case "5":
                    System.out.println("프로그램 종료");
                break;
            }





        }


    }
}
class Bank{
    private static String acc;
    private static String name;

    private static String money;
    static  int count =0;
    private static Bank instance;
    static Arrays[] accArr =new Arrays[100];
    private Bank(){

    }
    static public Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }

    public void setAccoutn(String _acc, String _name, String _money){
        acc= _acc;
        name = _name;
        money = _money;
//        accArr[count] = {acc, name, money};
        count++;
    }

    public static int getCount() {

        return count;
    }
}