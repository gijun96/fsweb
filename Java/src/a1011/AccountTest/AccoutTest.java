package a1011.AccountTest;

public class AccoutTest {
    public static void main(String[] args) {
        Account acc =new Account();
//        acc.balance =1000; //pravite 필드는 외부에서 사용불가
        acc.setBalance(1000);
        System.out.printf("잔액 : %d\n",acc.getBalance());
    }
}
class Account{
    private int balance;

    // getter  balance값을 호출 담당
    public  int getBalance(){
        return balance;
    }

    // setter balance값을 지정 담당(private 필드의 상태 변경)
    public void setBalance(int a){
        balance = a;
    }

}
