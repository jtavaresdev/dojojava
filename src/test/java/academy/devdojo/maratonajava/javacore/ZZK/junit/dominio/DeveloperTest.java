package academy.devdojo.maratonajava.javacore.ZZK.junit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    private Employee employeeDeveloper;

    @Test
    public void instaceOf_ExecutesChildClassMethod_WhenObjectIsChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        if (employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
        // Pattern Matching for instanceof
        if (employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }

    }

}