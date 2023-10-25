package a1025.ExceptionCheck.ex_8;

import java.io.IOException;

public class FileWriterExample{
    public static void main(String[] args) throws IOException{
        FileWriter fw = null;
        try {
            fw =new FileWriter("file.txt");
            fw.write(null);
            System.out.println("try");
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("IOException");
            fw.close();
        }


    }
}
