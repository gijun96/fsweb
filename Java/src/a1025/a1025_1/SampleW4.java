package a1025.a1025_1;

import a1025.ExceptionCheck.ex_8.FileWriter;

import java.io.IOException;
import java.io.PrintStream;

public class SampleW4 {
    public static void main(String[] args) throws IOException {
        PrintStream fw = new PrintStream("C:/temp/test1.txt");

        for (int i = 1; i<11;i++){
            String data = i + "번째 줄입니다.\r\n";
            fw.println(data);
        }
        fw.close();
    }
}
