package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        // 문자열 리스트에서 모든 문자열을 대문자로 변환한 후 쉼표로 구분된
        // 하나의 문자열을 얻는 JAVA 스트림 코드를 작성하십시오.
        List<String> str = Arrays.asList("apple", "banana", "cherry");
        String Upstr = str.stream()
                .map(String::toUpperCase)
                        .collect(Collectors.joining(", "));
        System.out.println(Upstr);


    }
}
