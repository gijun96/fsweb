package a1026.student;

import java.io.*;

public class StudentFile {
    private File file;
    private String dir;
    private String fileName;


    public StudentFile() {
        file = new File("c:\\");
    }
    public StudentFile(String dir, String fileName) {
        file = new File("c:\\"+dir+"\\"+fileName+".txt");
        this.dir = dir;
        this.fileName = fileName;
    }
    public boolean check(File file){
        if (file.exists()) return true;
        else return false;
    }


    public void create() throws IOException{
        boolean exist = check(file);
        if (exist){
            file.delete();
            file.createNewFile();
        }else {
            file = new File(dir);
            file.mkdir();
            file = new File(dir+"\\"+fileName);
            file.createNewFile();
        }
    }
    public void read() throws IOException{
        boolean exist = check(file);
        if (exist){
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }else {
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }
    public void write(String data) throws IOException{
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.println(data);
        pw.close();
    }

}
