package A1004;

public class A1004_10_ex4 {
    public static void main(String[] args) {


        while(true){
            int n = (int)(Math.random() * 4) + 1;
            int m = (int)(Math.random() * 4) + 1;
            System.out.println("n =" + n+ "," + "m = "+ m);

            System.out.println("n" + " + " + " m " + " = " + (n+m));
            if(n+m ==5 ){
                break;
            }
        }
    }
}
