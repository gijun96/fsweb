package a1025.Exception;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i =0; i<= array.length;i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]:" + value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환될수 없음" + e.getMessage());
            }
        }

    }
}