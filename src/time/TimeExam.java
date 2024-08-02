package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

    public static void main(String[] args) {
        // [LocalDateTime]
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint); // 2024-08-02T13:42:03.782286900
        System.out.println(timePoint.getMonth()); // 현재 날짜의 달을 Month형으로 나타낸다. ex) AUGUST  | 참고) Date, Calendar 와 다르게 month 정보를 출력했을 때 0부터 시작하지 않아 +1 할 필요 없음)
        System.out.println(timePoint.getMonthValue()); // 8
        System.out.println(timePoint.getDayOfYear()); // 215
        System.out.println(timePoint.getDayOfMonth()); // 2
        System.out.println(timePoint.getDayOfWeek()); // FRIDAY
        System.out.println(timePoint.getHour()); // 13
        System.out.println(timePoint.getMinute()); // 42

        // [LocalDate]
        LocalDate ld1 = LocalDate.of(2012, 12, 12);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld2);
        LocalDate ld3 = timePoint.toLocalDate();
        System.out.println(ld3);

        // [LocalTime]
        LocalTime lt1 = LocalTime.of(17, 18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);
        LocalTime lt3 = timePoint.toLocalTime();
        System.out.println(lt3);
    }
}

// Java에서 제공하는 Date, Time API는 부족한 기능 지원을 포함한 여러가지 문제점을 가지고 있었다.
// JDK 코어에서 이런 문제점들을 해결하고 더 좋고 직관적인 API들을 제공하기 위해 새롭게 재 디자인한 Date, Time API를 Java SE 8부터 제공한다.
