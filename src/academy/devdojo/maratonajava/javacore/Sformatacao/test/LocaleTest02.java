package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoC: isoCountries){
            System.out.print(isoC + " ");
        }
        System.out.println(" ");
        for (String isoL: isoLanguages){
            System.out.print(isoL + " ");
        }

    }
}
