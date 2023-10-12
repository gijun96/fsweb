package a1012.A1012_3;

public class ComputerExample extends Calculator {

    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer =new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));

    }
}
