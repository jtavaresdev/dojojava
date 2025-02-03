package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Gomu", "Gomu", "no", "mi"));
        String[] split = words.get(0).split("");
        System.out.println(Arrays.toString(split));

        List<String[]> collect = words.stream().map(m -> m.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(split);
        List<String> collect1 = words.stream().map(w -> w.split("")) // STREAM<STRING[]
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
