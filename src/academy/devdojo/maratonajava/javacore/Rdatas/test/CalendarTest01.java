package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro dia da semana é domingo");
        }
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.add(Calendar.HOUR, 2); // ROLL NAO MUDA O DIA MESMO PASSANDO DAS 24HRS.
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        Date date = c.getTime();
        System.out.println(date);

    }
}
