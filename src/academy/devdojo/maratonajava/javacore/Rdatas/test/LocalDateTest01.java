package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate ld = LocalDate.of(2012, Month.JUNE, 23);
        LocalDate agora = LocalDate.now();
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfMonth());
        System.out.println(agora.getDayOfYear());
    }
}
