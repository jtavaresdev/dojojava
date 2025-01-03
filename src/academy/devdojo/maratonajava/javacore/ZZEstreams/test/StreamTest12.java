package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Shadow Slave", 2.99, Category.FANTASY),
            new LightNovel("Reverend Insanity", 10.89, Category.FANTASY),
            new LightNovel("Lord of the Misteries", 4.99, Category.DRAMA),
            new LightNovel("RE:0", 19.99, Category.FANTASY),
            new LightNovel("The Eminence in Shadow", 3.99, Category.FANTASY),
            new LightNovel("Mother of Learning", 1.99, Category.ROMANCE),
            new LightNovel("The Quintessential Quintuplets", 3.99, Category.FANTASY)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
