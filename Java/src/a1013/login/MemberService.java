package a1013.login;

public class MemberService {
    String id;
    String password;

    String Userid;
    public boolean login(String id, String password){
        this.id =id;
        this.password =password;
        Userid =this.id;
            return id.equals("hong") && password.equals("12345");
    }

    public void logout(String id){
        this.id =id;
        if (Userid.equals(id)) {
            System.out.println(id + "님이 로그아웃 되었습니다.");
            Userid = null;
        }else{
            System.out.println("접속중인 사용자가 아닙니다.");
        }
    }


    public static void main(String[] args) {
        MemberService memberService =new MemberService();
        boolean result = memberService.login("hong", "12345");
        if (result){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
