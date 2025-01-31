package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

//        Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());
        for (Manga manga: mangas){
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(2L, "Dragon Ball Z", 2.99);
        // Ordenação customizada, posso passar o objeto
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator()));

    }
}
