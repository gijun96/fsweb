package a1025.Exception;

public class ExceptionHandlingExample {
    public static void printLength(String data) {
        if (data == null){
            System.out.println("null은 입력받을 수 없습니다.");
            return;
        }
        int result = data.length();
            System.out.println("문자 수 : " + result);
//        try {
//            int result = data.length();
//            System.out.println("문자 수 : " + result);
//        }catch (NullPointerException e){
////            System.out.println(e.getMessage());   // null
////            System.out.println(e.toString());       // java.lang.NullPointerException
////            e.printStackTrace();  // NullPointerException 에러발생 => 예외처리 후 실행 종료 후 에러발생 원인 출력
//                                    // 에러 발생에도 실행에 지장 없음. 다음 프로세스 진행 가능
//        }finally {
//            System.out.println("[마무리 실행]");
//        }
    }
    public static void main(String[] args){
        System.out.println("[프로그램 시작]\n");
        System.out.print("ThisisJAVA :");
        printLength("ThisisJAVA");
        System.out.print("null :");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
