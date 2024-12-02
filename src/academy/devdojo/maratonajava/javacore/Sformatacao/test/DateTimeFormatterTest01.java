package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        String s4 = date.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // tem como criar pattern e passar dps

        LocalDate parse = LocalDate.parse("2002-01-04");
        LocalDate parse1 = LocalDate.parse("20020104", DateTimeFormatter.BASIC_ISO_DATE);
        String format = parse.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println(format);
        System.out.println(parse1);
    }
}
