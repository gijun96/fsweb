package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        //주어진 숫자 리스트의 제곱값을 계산한느 Java 스트림의 코드를 작성하십시오.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqrNum = numbers.stream()
                .map(n-> n*n)
                .collect(Collectors.toList());
        System.out.println(sqrNum);

    }
}
