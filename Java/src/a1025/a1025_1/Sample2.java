package a1025.a1025_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample2 {
    public static void main(String[] args) throws IOException {
//      InputStream의 read 메서드는 1byte크기의 사용자의 입력을 받아드린다.
        // 1byte크기의 자료형으로 저장 0~255 사이의 정수값(아스키코드)
        System.out.println("값을 입력해주세요.");
        InputStreamReader reder = new InputStreamReader(System.in);

        char[] a = new char[3];
        reder.read(a);

        System.out.println(a);


    }
}
