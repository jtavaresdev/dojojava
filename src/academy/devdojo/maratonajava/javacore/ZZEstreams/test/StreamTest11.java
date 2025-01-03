package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(ln -> ln.getPrice()).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(ln -> ln.getPrice()).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String titles = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }

}
