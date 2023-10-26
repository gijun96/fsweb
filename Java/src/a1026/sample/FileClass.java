package a1026.sample;


import java.io.*;

public class FileClass {

    private File file;
    private String dir;
    private String fileName;

    public FileClass() {
        file = new File("d:\\");
    }

    public FileClass(String dir, String fileName) {
        this.dir = dir;
        this.fileName = fileName;
        file = new File("d:\\"+dir+"\\"+fileName+".txt");
        // d:\temp\abc.txt
    }

    public boolean check(File file){
        if (file.exists()) return true;
        else return false;
    }

    // create
    public void create() throws Exception{
        boolean exist = check(file);
        if (exist){
            file.delete();
            file.createNewFile();
        }else{
            file = new File(dir);
            file.mkdir();
            file = new File(dir+"\\"+fileName);
            file.createNewFile();
        }
    }
    public void write(String str) throws Exception{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(str);
            pw.close();
    }
    public void read() throws Exception{
        boolean exist = check(file);
        if (exist){
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
        }else {
            System.out.println("읽을 파일이 없습니다.");
        }
    }

}
