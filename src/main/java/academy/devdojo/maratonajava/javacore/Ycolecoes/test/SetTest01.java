package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>(); // n permite elementos duplicados, set não é indexado
        // HashSet (Sort como esta no equals/hashCode) , LinkedHashSet mantém a ordem de inserção
        mangas.add(new Manga(5L, "Hellsing Ultimate", 2.5, 5));
        mangas.add(new Manga(1L, "Berserk", 19.9, 0));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0)); // duplicado

        mangas.forEach(System.out::println); // for(Manga manga : mangas){.......}

    }
}
