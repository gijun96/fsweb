package a1016.Arrays;

import java.util.Arrays;

public class Arrays_7 {
    public static void main(String[] args) {
        int[] array1 = {1, 2 , 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEquals = Arrays.equals(array1, array2);
        System.out.println("Arrays are equals : "+ areEquals);
    }
}
