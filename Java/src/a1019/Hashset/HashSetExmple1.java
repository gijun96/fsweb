package a1019.Hashset;

import java.util.*;
public class HashSetExmple1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java");
        set.add("Spring");

        // 객체를 하나씩 가져와서 처리
    Iterator<String> iterator = set.iterator();
    while(iterator.hasNext()){
        // 객체를 하나 가져오기
        String element = iterator.next();
        System.out.println(element);
        if (element.equals("JSP")){
            iterator.remove();
        }
    }
        System.out.println();

//    객체 제거
        set.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        for(String element : set){
            System.out.println(element);
        }
    }
}
