package A1004;

public class A1004_7 {
    public static void main(String[] args) {

        for(int m =2; m <=9; m++){
            System.out.println("***" + m + "단***");
            for (int n = 1; n <=9; n++){
                System.out.println(m + " x " + n + " = "+ (n*m));
            }
        }
    }
}