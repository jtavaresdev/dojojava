package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String d1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String d2 = date.format(DateTimeFormatter.ISO_DATE);
        String d3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDate parse1 = LocalDate.parse("20240725", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-07-25+04:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-07-25", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime localDateTime = LocalDateTime.now();
        String d4 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(d4);
        LocalDateTime parse4 = LocalDateTime.parse("2024-07-25T15:59:13.518459633", DateTimeFormatter.ISO_DATE_TIME); // como é  o padrao, pode passar sem DateTimeFormatter
        System.out.println(parse4);

        //Pattern de datas
        //dd/MM/yyyy
        //MM/dd/yyy
        //yyyy/MM/dd

        DateTimeFormatter fBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fEua = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fJapao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter fAlemanha = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);

        System.out.println(date.format(fBrasil));
        System.out.println(date.format(fEua));
        System.out.println(date.format(fJapao));
        System.out.println(date.format(fAlemanha));


    }
}
