package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeNOw = LocalTime.now();
        System.out.println(timeNOw);
        System.out.println(timeNOw.withNano(0));

        System.out.println(timeNOw.getHour());
        System.out.println(timeNOw.getMinute());
        System.out.println(timeNOw.getSecond());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
