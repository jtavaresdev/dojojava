package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2002, 1, 4, 8, 30);
        Duration d1 = Duration.between(ldt2, ldt1);
        System.out.println(d1);
    }
}
