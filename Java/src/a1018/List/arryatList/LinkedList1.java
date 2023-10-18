package a1018.List.arryatList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> arrList = new LinkedList<String>();

        arrList.add("넷");
        arrList.add("둘");
        arrList.add("셋");
        arrList.add("하나");

        for (int i =0; i< arrList.size();i++){
            System.out.print(arrList.get(i)+ " ");
        }
        System.out.println();
        arrList.remove(1);
        for(String e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();
        Collections.sort(arrList);
        for (String e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();

        arrList.set(0, "다섯");
        for (String e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("리스트의 크기 : " + arrList.size());

    }
}
