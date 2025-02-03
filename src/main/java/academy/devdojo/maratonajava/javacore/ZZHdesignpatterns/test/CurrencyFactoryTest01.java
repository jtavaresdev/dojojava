package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Country;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Currency;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency currency1 = CurrencyFactory.newCurrency(Country.USA);
        System.out.println(currency.getSymbol());
        System.out.println(currency1.getSymbol());
    }
}
