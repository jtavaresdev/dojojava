package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1732735060861L);// long
        date.setTime(date.getTime()+3_600_600);
        System.out.println(date);
    }
}
