package arr_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;


public class ex5 {
    public static void main(String[] args) {
// 두 개의 2차원 배열을 입력으로 받아, 두 배열을 가로로 합치는 프로그램을 작성하세요.
        int[][] arr1 ={{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6},{7, 8}};

        int[][] arr3 = new int[2][2];

        for(int i =0; i< arr1.length-1;i++){
            for (int j = 0; j<arr1.length-1;j++){
                arr3[i][j] = arr1[i][j];
            }
        }
        System.out.println(arr3);

asdfasgadgheadhasefafas

    }
}
