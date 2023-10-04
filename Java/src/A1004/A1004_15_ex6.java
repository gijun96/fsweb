package A1004;

public class A1004_15_ex6 {
    public static void main(String[] args) {
    String star ="*";
//        for (int i = 1; i <=5; i++){
//            System.out.println(star);
//            for (int j = 0; j<i; j++){
//                System.out.print(star);
//            }
//        }
//        System.out.print(star);


        for(int i =1; i<=5;i++){
            for (int j =1; j <=i;j++){
                System.out.print("*");
                if(j==i) System.out.println();
            }
        }
    }
    }

