package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

// 1 . Order LightNovel by title
// 2 . Retrieve the first 3 light novels with prices less than 4

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Shadow Slave", 2.99),
            new LightNovel("Reverend Insanity", 10.89),
            new LightNovel("Lord of the Misteries", 4.99),
            new LightNovel("RE:0", 19.99),
            new LightNovel("The Eminence in Shadow", 3.99),
            new LightNovel("Mother of Learning", 1.99),
            new LightNovel("The birth of Demonic Sword", 3.99)));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> names = new ArrayList<>(3);
        for (LightNovel novels : lightNovels) {
            if (novels.getPrice() <= 4) {
                names.add(novels.getTitle());

            }
            if (names.size() >= 3) {
                break;
            }
        }
        System.out.println(names);
       // System.out.println(lightNovels);
    }
}
