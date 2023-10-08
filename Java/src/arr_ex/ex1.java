package arr_ex;

public class ex1 {
    public static void main(String[] args) {
//        배열에서 최대값 찾기
        int[] numbers = {5, 10, 3, 7, 2, 8};
        int max = 0;
        for (int i = 0; i <numbers.length-1;i++){
            if (max<numbers[i])max = numbers[i];
        }
        System.out.println(max);
    }
}
