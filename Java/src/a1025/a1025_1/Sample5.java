package a1025.a1025_1;

import java.io.IOException;
import java.io.InputStream;

public class Sample5 {
    public static void main(String[] args) throws IOException {
        System.out.println("값을 입력해주세요.");
        InputStream in = System.in;

        int a ;
        int b ;
        int c ;

        a= in.read();
        b= in.read();
        c= in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
