package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter2Years = LocalDate.of(2002, Month.JANUARY, 4);
        Period p1 = Period.between(now, nowAfter2Years);
        Period p2 = Period.ofWeeks(22);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(now.until(nowAfter2Years, ChronoUnit.WEEKS));

    }
}
