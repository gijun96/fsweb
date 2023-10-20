package a1020.ex_2;

import java.util.*;
public class Ram5 {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8};

        // 1. Arrays.stream(data) 로 정수배열을 IntStream으로 생성
        // 2. boxed() :  IntStream을 Integer의 Stream으로 변경
        //              => 뒤에 사용할 Comparator.reverseOrder() 사용하기 위해
        //                 원시 타입인 int 대신 Integer로 변경해야함.
        // 3. distinct() 로 스트림에서 중복을 제거한다.
        // 4. sort(Comarator.reverseOrder()) : 역순 정렬
        // 5. .mapToInt(Integer::intValue) : Integer의 스트림을 IntStream으로 변경
        // toArray() 를 호출하여 INtStream의 배열인 int[] 배열을 리턴한다.

        int[] result = Arrays.stream(data)
                .boxed()
                .filter((a)-> a%2 == 0)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray()
                ;
                };
    }
