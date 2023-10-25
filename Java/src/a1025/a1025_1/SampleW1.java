package a1025.a1025_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class SampleW1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("C:/temp/test1.txt");
        System.out.println(output);
        output.close();

    }
}
