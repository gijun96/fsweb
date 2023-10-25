package a1025.a1025_1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleW7 {
    public static void main(String[] args) throws IOException {
       byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/temp/test1.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();


    }
}
