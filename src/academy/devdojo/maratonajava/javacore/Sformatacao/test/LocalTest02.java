package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        for (String isoCountry : Locale.getISOCountries()) {
            System.out.print(isoCountry);
            System.out.print(" ");
        }
        System.out.println();
        for (String isoLanguage : Locale.getISOLanguages()) {
            System.out.print(isoLanguage);
            System.out.print(" ");
        }



    }
}
