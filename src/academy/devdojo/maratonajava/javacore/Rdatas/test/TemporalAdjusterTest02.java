package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 12, 6);
        System.out.println(retornaProximaDiaUtil(ld));
    }

    public static LocalDate retornaProximaDiaUtil(LocalDate localDate) {
        if (localDate.getDayOfWeek() == DayOfWeek.FRIDAY || localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        } else {
            return localDate;
        }

    }
}
