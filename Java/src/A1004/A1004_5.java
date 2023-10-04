package A1004;

public class A1004_5 {
    public static void main(String[] args) {
    int result = 0;
    int i = 0;
        for(i =1; i<=100; i++){
//            result = result + i;
            result += i;

        }
//        System.out.println("1부터 100까지의 합 :" + result);
//        System.out.println("1부터 " + (i-1) + "까지의 합 :" + result);
        System.out.printf("1~%d까지 합: %d\n", (i-1), result);
    }

}
