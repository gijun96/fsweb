package a1023.ex_6;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 85));
        studentList.add(new Student("홍길동", 92));
        studentList.add(new Student("홍길동", 87));

        // Student 를 score 스트림으로 변환
        studentList.stream()
                .mapToInt(s-> s.getScore())
                .forEach(score-> System.out.println(score));
    }

}
