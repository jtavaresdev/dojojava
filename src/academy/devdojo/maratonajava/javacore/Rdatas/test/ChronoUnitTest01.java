package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniverserio = LocalDateTime.of(2002, Month.JANUARY, 4, 12, 0);
        System.out.println(ChronoUnit.DAYS.between(aniverserio, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniverserio, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniverserio, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniverserio, LocalDateTime.now()));
    }
}
