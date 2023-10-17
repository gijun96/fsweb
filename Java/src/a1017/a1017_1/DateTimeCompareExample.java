package a1017.a1017_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
        System.out.println("시작일 : " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
        System.out.println("종료일 : " + endDateTime);

        if (startDateTime.isBefore(endDateTime)){
            System.out.println("진행중 입니다.");
        }else if(startDateTime.isEqual(endDateTime)){
            System.out.println("종료합니다.");
        }else if(startDateTime.isAfter(endDateTime)){
            System.out.println("종료했습니다.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);

        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMin = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSec = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

        System.out.println("남은 해 : " + remainYear);
        System.out.println("남은 달 : " + remainMonth);
        System.out.println("남은 일 : " + remainDay );
        System.out.println("남은 시간 : " + remainHour);
        System.out.println("남은 분 : " + remainMin);
        System.out.println("남은 초 : " + remainSec);

    }
}
