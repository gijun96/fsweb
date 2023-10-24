package a1024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
//        문제 1: 문자열 목록에서 길이가 3 이하인 문자열 제외하기
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> str = strings.stream()
                .filter(s->s.length()>= 3)
                .collect(Collectors.toList());
        System.out.println(str);
//        문제 2: 숫자 목록에서 중복값 제거하기
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> n = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(n);
        //문제 3: 사람 목록에서 나이가 가장 어린 사람 찾기
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        );



        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));

//        String youngestName = youngestPerson.map(Person::getName).orElse("No youngest person found");
//        System.out.println("Youngest person: " + youngestName);
        youngestPerson.ifPresent(person -> System.out.println("가장 어린 친구 : "+person.getName()));



        //문제 4: 문자열 목록에서 문자열 길이 평균 구하기
        List<String> strings1 = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        double avgLength = strings1.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);


        System.out.println(avgLength);
        //orElse : 기본값을 지정하여 안전하게 값을 가져옴
        // getAsDouble : 값이 반드시 존재해야하는 경우에 사용되어야함

        //문제 5: 사람 목록에서 특정 조건을 만족하는 사람 수 구하기
        //성별이 여성인 사람수 구하기
        List<Person> people2 = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성")
        );
        long femaleCount = people2.stream()
                .filter(p->p.getGender().equals("여성"))
                .count();
        System.out.println(femaleCount);
        List<Person> personList = people2.stream()
                .filter(person -> person.getAge()>=25)
                .collect(Collectors.toList());
        personList.forEach(person -> System.out.println("age: "+person.getAge()+" name: "+ person.getName()));

        List<Integer> numbers1 = Arrays.asList(1, -2, 3, -4, 5, -6);
        List<Integer> num = numbers1.stream()
                .filter(integer -> integer>0)
                .collect(Collectors.toList());
        System.out.println(num);
        }


    }

