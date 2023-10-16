package a1016.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_4 {
    public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 5, 6};
    Arrays.sort(numbers);
    for(int number : numbers){
        System.out.print(number + " ");
    }

    }
}
