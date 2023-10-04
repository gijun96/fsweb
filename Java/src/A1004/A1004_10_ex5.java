package A1004;

public class A1004_10_ex5 {
    public static void main(String[] args) {


        for(int x = 1; x<=10; x++){
            int n = x *4;
            for(int y =1; y<=10;y++){
               int m = y *5;
               if(n+m == 60){
                   System.out.println("("+x +", "+ y+")");
               }
            }

        }

    }
}
