package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime0 = new Anime();
        Anime anime = new Anime("Haikyu", "Tv", 12, "Ação");
        Anime anime2 = new Anime("Naruto", "TV", 400, "Shounen", "Kadowasa");
        anime.imprime();
        anime2.imprime();

    }
}
