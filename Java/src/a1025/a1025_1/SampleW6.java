package a1025.a1025_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class SampleW6 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw1 = new PrintWriter("C:/temp/test1.txt");
        for (int i = 1; i<11;i++){
            String data = i + "번째 줄입니다.\r\n";
            pw1.write(data);
        }
        pw1.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("C:/temp/test1.txt"), true);
        for (int i = 11; i<21;i++){
            String data = i + "번째 줄입니다.\r\n";
            pw2.write(data);
        }
        pw2.close();
    }
}
