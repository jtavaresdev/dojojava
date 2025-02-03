package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Shadow Slave", 2.99),
            new LightNovel("Reverend Insanity", 10.89),
            new LightNovel("Lord of the Misteries", 4.99),
            new LightNovel("RE:0", 19.99),
            new LightNovel("The Eminence in Shadow", 3.99),
            new LightNovel("Mother of Learning", 1.99),
            new LightNovel("Mother of Learning", 1.99),
            new LightNovel("The birth of Demonic Sword", 3.99)));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
        double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice).filter(price -> price > 3).sum();
        System.out.println(sum);


    }

}
