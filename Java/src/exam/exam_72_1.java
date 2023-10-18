package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collector;

public class exam_72_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max =0;
        while(true){
            System.out.println("숫자를 입력하세요.");
            int n =scanner.nextInt();
            arr.add(n);
            Collections.sort(arr);
            max = arr.get(arr.size()-1);

            if (n ==0){
                break;
            }
            System.out.println(max);
        }
    }
}
