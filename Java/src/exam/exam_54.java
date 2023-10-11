package exam;

import java.util.Scanner;

public class exam_54 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calc c =new Calc();
        System.out.println("a를 입력하여 주세요.");
        c.a = scanner.nextInt();
        System.out.println("b를 입력하여 주세요.");
        c.b =scanner.nextInt();

        if(c.b%c.a ==0){
            System.out.printf("%d\t%d =====> %d * %d = %d\n", c.a, c.b, c.a, c.x(), c.b);
        }else if(c.a%c.b ==0){
            System.out.printf("%d\t%d =====> %d * %d = %d\n", c.b, c.a, c.b, c.x(), c.a);
        }else{
            System.out.printf("%d\t%d =====> none\n", c.a, c.b);
        }
    }


}
class Calc{
    int a;
    int b;
    int x(){
        int result = 0;
        if(b%a ==0){
            result = b/a;
        }else if(a%b ==0) {
            result =  a/b;
        }
        return result;
    }
}



