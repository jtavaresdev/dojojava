package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        // fechou a primeira Stream "stream" criada na linha 21
        // tive que fazer isso abaixo, para criar outra stream para utilizar
        long count1 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();
        System.out.println(count);
        System.out.println(count1);
    }
}
