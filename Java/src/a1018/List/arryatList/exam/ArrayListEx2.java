package a1018.List.arryatList.exam;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("apple");
        arrlist.add("banana");
        arrlist.add("cherry");
        arrlist.add("date");

        arrlist.remove(1);
        for (String str :  arrlist){
            System.out.print(str+ " ");
        }


    }
}
