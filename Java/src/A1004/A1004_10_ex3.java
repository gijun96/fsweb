package A1004;

import java.util.Scanner;

public class A1004_10_ex3 {
    public static void main(String[] args) {
    int sum = 0;
        for(int i =0; i <=100; i++){
            if(i%3 ==0){
                sum += i;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 총합" + sum);
    }
}
