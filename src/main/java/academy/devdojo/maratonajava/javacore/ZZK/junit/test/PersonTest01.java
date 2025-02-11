package academy.devdojo.maratonajava.javacore.ZZK.junit.test;

import academy.devdojo.maratonajava.javacore.ZZK.junit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZK.junit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonTest01 {
    public static void main(String[] args) {
        Person per = new Person(18);
        log.info("Is adult? '{}'",new PersonService().isAdult(per));
    }
}
