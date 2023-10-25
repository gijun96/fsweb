package a1025.ExceptionCheck.ex_7;

public class LoginExample{
    public static void main(String[] args) {

        try {
            login("white", "12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "1235");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    public static void login(String id, String password) throws NotExistIDException{
        // id가 blue가 아니라면 NotExistIDException을 발생시킴
        if (!id.equals("blue")){
            System.out.println("아이디가 존재하지 않습니다.");
        }
        //password가 12345가 아니라면 WrongPasswordException을 발생시킴
        if (!password.equals("12345")){
            System.out.println("패스워드가 틀립니다.");
        }

    }
}
