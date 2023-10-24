package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        // 문자열 리스트에서 길이가 5이상인 문자열만 선택하는 Java스트림 코드를 작성하십시오.
        List<String> str = Arrays.asList("apple", "banana", "cherry","date", "elderberry");
        List<String> str_leng5 = str.stream()
                .filter(s-> s.length()>=5)
                .collect(Collectors.toList());
        str_leng5.forEach(System.out::println);

    }
}
