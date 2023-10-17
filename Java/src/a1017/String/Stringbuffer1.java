package a1017.String;

public class Stringbuffer1 {
    public static void main(String[] args) {
//        StringBuffer str = new StringBuffer("Java");
        StringBuilder str = new StringBuilder("Java");
        System.out.println("원본 문자열 : "+ str);

        System.out.println(str.append("수업"));
        System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);
    }

}
