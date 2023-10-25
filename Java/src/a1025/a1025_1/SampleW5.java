package a1025.a1025_1;

import a1025.ExceptionCheck.ex_8.FileWriter;

import java.io.IOException;

public class SampleW5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw1 = new FileWriter("C:/temp/test1.txt");

        for (int i = 1; i<11;i++){
            String data = i + "번째 줄입니다.\r\n";
            fw1.write(data);
        }
        fw1.close();

        FileWriter fw2 = new FileWriter("C:/temp/test1.txt");
        for (int i = 11; i<21;i++){
            String data = i + "번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
