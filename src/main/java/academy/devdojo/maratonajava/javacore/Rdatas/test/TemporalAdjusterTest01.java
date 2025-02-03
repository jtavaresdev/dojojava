package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //Temporal Adjuster troca o  valor do mês em questao e nao adciona como o .plus()
        date = date.with(ChronoField.DAY_OF_MONTH, 1);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        //next, nextOrSame, previous, previousOrSame

        date = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());


    }
}
