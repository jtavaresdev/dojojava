package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on Titan");
        mangas.add("Dragon Ball Z");
        Collections.sort(mangas); //Collections classe utilitárias

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.91);
        dinheiros.add(21.63);
        dinheiros.add(98.2);
        Collections.sort(dinheiros); // Big O (n * log n)

        for (String nameManga : mangas){
            System.out.println(nameManga);
        }

        for (Double n : dinheiros){
            System.out.println(n);
        }
    }
}
