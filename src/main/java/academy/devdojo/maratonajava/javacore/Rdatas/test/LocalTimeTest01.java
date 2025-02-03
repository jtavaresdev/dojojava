package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(22, 2, 45, 12542);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());
        System.out.println(time1.getSecond());
        System.out.println(time1.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(LocalTime.MIN);

    }
}
