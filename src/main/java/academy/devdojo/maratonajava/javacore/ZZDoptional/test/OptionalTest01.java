package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.awt.*;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        String tavares = findName("Tavares");
        System.out.println(tavares);
    }
    private static String findName(String name){
        Optional<String> o1 = Optional.of("Name not found ");
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o1);
        System.out.println(o2);
        List<String> names = List.of("João", "Tavares", "Victor");
        int i = names.indexOf(name);
        if (i > 0){
            return names.get(i);
        }
        return o1.get();
    }
}
