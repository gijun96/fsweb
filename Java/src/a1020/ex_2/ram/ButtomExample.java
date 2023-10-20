package a1020.ex_2.ram;

import java.awt.*;

public class ButtomExample {

    public static void main(String[] args) {
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식 (ClickListener 익명 구현 객체 ) 주입
        btnOk.setClickListener(()->{
            System.out.println("ok 버튼을 클릭하였습니다.");
        });

        btnOk.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        btnCancel.click();

    }
}
