package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nb = new NumberFormat[3];
        double numero = 1000.21;

        nb[0] = NumberFormat.getCurrencyInstance(); // FORMATAÇÃO DE MOEDAS
        nb[1] = NumberFormat.getCurrencyInstance(localeBR);
        nb[2] = NumberFormat.getCurrencyInstance(localeJP);

        for (NumberFormat numberFormat: nb){
            System.out.println(numberFormat.format(numero));
        }

        String valorString = "$1000.21"; // precisa da cifra do sistema

        try {
            System.out.println(nb[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
