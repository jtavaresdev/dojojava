package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        //now = now.withDayOfMonth(4);
        //now1 = now1.with(ChronoField.DAY_OF_MONTH, 27);
        now = now.with(ChronoField.DAY_OF_MONTH, 21);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(ChronoField.DAY_OF_WEEK, 1);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //TemporalAdjuster - LastDayOfTheMonth, FirstDayOfTheMonth, .....


    }
}
