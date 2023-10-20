package a1020.ex_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ram7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> filterdName = names.stream()
                .filter(name ->name.length() > 4)
                .collect(Collectors.toList())
                ;
        String[] nameArray = filterdName.toArray(new String[0]);
        for (String name: nameArray){
            System.out.println(name);
        }


    }
}
