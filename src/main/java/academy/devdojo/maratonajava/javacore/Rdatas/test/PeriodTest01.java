package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2002, 1, 4);
        LocalDate localDateNow = LocalDate.now();
        Period p1 = Period.between(localDate, localDateNow);
        System.out.println(localDate.until(localDateNow, ChronoUnit.DAYS));
    }
}
