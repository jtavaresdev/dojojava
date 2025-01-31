package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;

public class PessoaBuilderPatternTest01 {
    public static void main(String[] args) {
        Person per = Person.PersonBuilder
                .builder() //factory
                .firstName("Joao")
                .lastName("Tavares")
                .email("jtavaresgestor@gmail.com")
                .userName("jtavaresdev")
                .build();
        System.out.println(per.toString());
    }
}
