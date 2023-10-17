package a1017.a1017_1;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DecimalFormatExample {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        //정수 자리까지 표기
       df= new DecimalFormat("#,###");
        System.out.println(df.format(num));

        // 무조건 소수 첫째 자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));

    }
}
