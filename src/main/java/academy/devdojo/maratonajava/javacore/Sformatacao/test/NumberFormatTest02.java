package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale locatePT = new Locale("pt", "BR");
        Locale locateJA = Locale.JAPAN;
        Locale locateIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] = NumberFormat.getCurrencyInstance(locateJA);
        nfa[2] = NumberFormat.getCurrencyInstance(locatePT);
        nfa[3] = NumberFormat.getCurrencyInstance(locateIT );
        double valor = 1000.2130;

        for (NumberFormat numbers : nfa) {
            System.out.println(numbers.format(valor));
        }
        String valorString = "$1,000.21";
        try {
            System.out.println((nfa[0].parse(valorString)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
