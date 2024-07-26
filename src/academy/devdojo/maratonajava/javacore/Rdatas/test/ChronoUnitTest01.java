package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2002, Month.JANUARY,4, 12,0,0);
        System.out.println("Tempo de vida do meu amor");
        System.out.println("Dias: "+ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println("Semanas: "+ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println("Meses: "+ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println("Anos: "+ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
    }
}
