package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2025, Month.DECEMBER, 22);
        LocalTime time = LocalTime.of(10, 30);
        LocalDateTime ld1 = date.atTime(time);
        LocalDateTime ld2 = time.atDate(date);

        System.out.println(localDateTime.withNano(0));
        System.out.println(ld1);
        System.out.println(ld2);

    }
}
