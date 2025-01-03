package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> p1 = List.of("Joao", "Tavares", "Neto");
        List<String> p2 = List.of("Joana", "Andrea", "Fatima", "Jhennifer");
        devdojo.add(p1);
        devdojo.add(p2);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("===============");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
