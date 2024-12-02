package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import static java.lang.Double.parseDouble;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale locatePT = new Locale("pt", "BR");
        Locale locateJA = Locale.JAPAN;
        Locale locateIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locateJA);
        nfa[2] = NumberFormat.getInstance(locatePT);
        nfa[3] = NumberFormat.getInstance(locatePT);
        double valor = 10_000.2130;

        for (NumberFormat numbers : nfa) {
            System.out.println(numbers.format(valor));
        }
        String valorString = "1000,2130";
        try {
            System.out.println((nfa[0].parse(valorString)));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
