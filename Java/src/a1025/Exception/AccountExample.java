package a1025.Exception;

import a1016.A1016_8.A;

import javax.naming.InsufficientResourcesException;

public class AccountExample {
    public static void main(String[] args) throws InsufficientException {
        Account account = new Account();
        // 예금하기
        account.deposit(10000);
        System.out.println("예금액 : "+ account.getBalance());

        //출금하기
        try {
            account.withdraw(30000);
        }catch (InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}