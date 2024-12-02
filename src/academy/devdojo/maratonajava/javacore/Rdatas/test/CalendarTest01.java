package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro dia da Semana é domingão");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
