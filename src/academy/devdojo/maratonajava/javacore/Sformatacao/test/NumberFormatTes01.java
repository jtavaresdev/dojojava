package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormatTes01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nb = new NumberFormat[3];
        double numero = 100_100_100.21354;

        nb[0] = NumberFormat.getInstance();
        nb[1] = NumberFormat.getInstance(localeBR);
        nb[2] = NumberFormat.getInstance(localeJP);

        for (NumberFormat numberFormat: nb){
            System.out.println(numberFormat.format(numero));
        }


    }
}
