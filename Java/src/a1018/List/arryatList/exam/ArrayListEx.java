package a1018.List.arryatList.exam;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i =1; i<=5; i++){
            arrlist.add(i*10);
        }
        int sum =0;
        for (int a : arrlist){
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println();
        System.out.println(sum);
    }
}
