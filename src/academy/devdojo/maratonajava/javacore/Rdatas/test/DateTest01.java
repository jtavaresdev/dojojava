package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = Date.from(Instant.now()); // long 100000
        System.out.println(date);

    }
}
