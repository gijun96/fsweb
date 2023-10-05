package A1005;

import java.util.Arrays;

public class A1005_15 {
    public static void main(String[] args) {

    //1.배열의 합
        int[] array = {1, 2, 3, 4, 5};
        int sum =0;
        for(int i =0; i< array.length;i++){
            sum += array[i];
        }
        System.out.println("배열의 합 : " + sum);
//       2. 최대값과 최소값 찾기
        int[] array2 = {10, 5, 8, 21,3};
//        최대값
        String max = Arrays.stream(array2).max().toString().replaceAll("[^0-9]", "");
        System.out.println("array2의 최대값 : "+max);
//        최소값
        String min =  Arrays.stream(array2).min().toString().replaceAll("[^0-9]", "");
        System.out.println("array2의 최소값 : "+min);

        /*
        int[] array = {10, 5, 8, 21, 3};
int max = array[0];
int min = array[0];

for (int i = 1; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
    if (array[i] < min) {
        min = array[i];
    }
}

System.out.println("최대값: " + max);
System.out.println("최소값: " + min);
        */



//        3. 배열 요소의 평균"''
        double[] array3 = {2.5, 3.0, 1.5, 4.0, 2.0};
        double sum3 = 0d;
        for(int i = 0; i<array3.length;i++){
            sum3 += array3[i];
        }
//        System.out.println(sum3);
        double avg3 = (double) sum3/array3.length;
        System.out.println(avg3);

//        4. 배열 요소 뒤집기
        String[] array4 = {"apple", "banana", "cherry", "date"};
        String[] reverseArr = new String[array4.length];
        for (int i =0;i<array4.length;i++){
            reverseArr[i] = array4[array4.length-1-i];
            System.out.println("reverseArr[" +i+"] :"+reverseArr[i]);
        }
        array4 =reverseArr;
        for(int i =0; i<array4.length;i++){
            System.out.println("array4["+i+"] : "+ array4[i]);
        }
        //String[] array = {"apple", "banana", "cherry", "date"};
        //
        //for (int i = 0; i < array.length / 2; i++) {
        //    String temp = array[i];
        //    array[i] = array[array.length - 1 - i];
        //    array[array.length - 1 - i] = temp;
        //}
        //
        //System.out.println("배열 요소 뒤집기:");
        //for (String str : array) {
        //    System.out.println(str);
        //}

    }
}
