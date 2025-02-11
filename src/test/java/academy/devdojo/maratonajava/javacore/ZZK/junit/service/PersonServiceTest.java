package academy.devdojo.maratonajava.javacore.ZZK.junit.service;

import academy.devdojo.maratonajava.javacore.ZZK.junit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }
    @Test
    @DisplayName("A person should bet not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }
    @Test
    @DisplayName("A person should adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeisGreaterOrEqualThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }
    @Test
    @DisplayName("Should throw nullpointerexception if person is null")
    void isAdult_ReturnNullPointerException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> personService.isAdult(null),"Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> listPerson = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(listPerson).size());
    }


}