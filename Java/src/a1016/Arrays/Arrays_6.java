package a1016.Arrays;

import java.util.Arrays;

public class Arrays_6 {
    public static void main(String[] args) {
    int[] numbers = {4, 7, 2, 9, 1, 5};
    Arrays.sort(numbers);
    int index = Arrays.binarySearch(numbers, 7);
        System.out.println("7 found at index :  "+ index);
    }
}
