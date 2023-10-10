package A1010.sec05.Squre;


public class Squre {
    int length;
    int area;

    int Area() {
        return area = length * length;
    }

    public static void main(String[] args) {
        Squre sqr = new Squre();

        sqr.length = 4;

        System.out.printf("한변의 길이가 %d인 정사각형의 넗이 : %d", sqr.length, sqr.Area());


    }
}

