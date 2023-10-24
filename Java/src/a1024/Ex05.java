package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex05 {
    public static void main(String[] args) {
    // 주어진 문자열 리스트에서 문자'a'를 포함하는 문자열의 수를 게산하는
        // Java 스트림 코드를 작성하십시오.
        List<String> str = Arrays.asList("apple", "banana", "cherry", "date");
        long count = str.stream()
                .filter(s -> s.contains("a"))
                .count();
        System.out.println(count);

    }
}
