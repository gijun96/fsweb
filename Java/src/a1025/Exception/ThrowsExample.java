package a1025.Exception;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외처리: "+ e.toString());
        }
    }

    private static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}