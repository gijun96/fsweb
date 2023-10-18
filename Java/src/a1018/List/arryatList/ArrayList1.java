package a1018.List.arryatList;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        for (int i =0; i< arrList.size();i++){
            System.out.print(arrList.get(i)+ " ");
        }
        System.out.println();
        arrList.remove(1);
        for(int e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();
        // Collections.sort() 메서드를 이용한 요소의 정렬
        Collections.sort(arrList);
        for (int e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();
        // Iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+ "! ");
        }
        System.out.println();

        arrList.set(0, 20);
        for (int e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("리스트의 크기 : " + arrList.size());

    }
}
