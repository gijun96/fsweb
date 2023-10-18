package a1018.Generic.ex1_1;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};

        String[] strArray = {"apple", "banana", "cherry"};
        String firstStr = Utillity.getFirstElement(strArray);

        System.out.println(firstStr);
    }
}
    class Utillity {
        public static <T> T getFirstElement(T[] array){
            if (array != null && array.length>0){
                return array[0];
            }
        return null;
    }
}
