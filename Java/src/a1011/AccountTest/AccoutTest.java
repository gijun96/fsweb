package a1011.AccountTest;

public class AccoutTest {
    public static void main(String[] args) {
        Account acc =new Account();
//        acc.balance =1000; //pravite 필드는 외부에서 사용불가
        acc.setAccNum(1000);
        System.out.printf("잔액 : %d\n",acc.getAccNum());
    }
}
class Account{
    private int accNum;

    // getter  balance값을 호출 담당
    public  int getAccNum(){
        return accNum;
    }

    // setter balance값을 지정 담당(private 필드의 상태 변경)
    public void setAccNum(int a){
        accNum = accNum+a;
    }

}
