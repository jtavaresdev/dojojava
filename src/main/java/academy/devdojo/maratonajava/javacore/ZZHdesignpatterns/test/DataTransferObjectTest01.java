package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("BOING-787");
        Country brasil = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(brasil);
        Person person = Person.PersonBuilder.builder().
                firstName("João")
                .lastName("Tavares")
                .build();
        ReportDto dataReport = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(brasil)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(dataReport);

    }
}
