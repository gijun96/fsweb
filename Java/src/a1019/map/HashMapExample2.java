package a1019.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
    Map<String, Integer> studentScores = new HashMap<>();

    studentScores.put("Alice", 85);
    studentScores.put("Bob", 92);
    studentScores.put("Charlie", 78);
    studentScores.put("David", 95);
    studentScores.put("Eva", 88);
    String studentName = "Bob";
    if(studentScores.containsKey(studentName)){
        int score = studentScores.get(studentName);
        System.out.println(studentName +"의 점수 : "+score);
    }else{
        System.out.println(studentName +"의 점수를 찾을 수 없습니다.");
    }
    // 모든 학생들의 이름과 점수 출력
        for(Entry<String, Integer> entry : studentScores.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }

    }
}
