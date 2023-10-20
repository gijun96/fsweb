package a1020.ex_2;

import java.util.*;
import java.util.stream.Collectors;

public class Ram6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filterdName = names.stream()
                .filter(name ->name.length() > 4)
                .collect(Collectors.toList())
                ;
        System.out.println("기존의 이름 리스트 : "+names);
        System.out.println("길이가 4보다 큰 이름 리스트 : "+filterdName);
    }
}
