package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.parse("2025-01-13");
        LocalTime localTime = LocalTime.of(10, 30);
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        LocalDateTime localDateTime1 = localDate.atTime(localTime);// date add time or time add date work as well
        System.out.println(localDateTime1);

    }
}
