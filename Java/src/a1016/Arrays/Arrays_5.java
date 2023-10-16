package a1016.Arrays;

import java.util.Arrays;

public class Arrays_5 {
    public static void main(String[] args) {
    int[] sourceArray = {1, 2, 3, 4, 5};
    int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("SourceArray: "+ Arrays.toString(sourceArray));
        System.out.println("CopiedArray: "+ Arrays.toString(destinationArray));

    }
}
