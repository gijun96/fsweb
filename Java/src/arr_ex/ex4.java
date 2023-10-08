package arr_ex;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ex4 {
    public static void main(String[] args) {
// 정수 배열에서 중복된 요소를 제거하고 중복이 제거된 배열을 반환하는 프로그램을 작성하세요.
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
       //  배열 => stream => 중복제거 -> 배열
        int[] resultArr = Arrays.stream(numbers).distinct().toArray();

        System.out.println(Arrays.toString(resultArr));


    }
}
