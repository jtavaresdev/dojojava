package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(l -> l.getPrice() > 90));
        System.out.println(lightNovels.stream().allMatch(l -> l.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(l -> l.getPrice() < 0));
        lightNovels.stream().filter(ln -> ln.getPrice()> 3).findAny().ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 4)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst().ifPresent(System.out::println);
    }
}
