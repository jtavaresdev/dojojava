package academy.devdojo.maratonajava.javacore.ZZClambdas.test;


import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 21), new Anime("One Piece", 1122), new Anime("Naruto", 500)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//         n posso usar no de cima pq tem duas chamadas o metodo, getTitle().compareTo()
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
