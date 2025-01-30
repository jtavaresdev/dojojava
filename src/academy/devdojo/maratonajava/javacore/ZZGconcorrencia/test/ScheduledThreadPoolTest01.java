package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService exercutor = Executors.newScheduledThreadPool(1);
    private static void beeper(){
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))+ " Beep");
        };
        exercutor.schedule(r, 5, TimeUnit.SECONDS);
        exercutor.shutdown();
    }

    public static void main(String[] args) {
        beeper();
    }
}
