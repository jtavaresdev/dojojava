package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
//        Stream.iterate()
//        Stream.generate()
        Stream.iterate(0, n -> n + 2)
                .limit(10).forEach(System.out::println);
        // série de fibonacci
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);
        ThreadLocalRandom radom = ThreadLocalRandom.current();
        Stream.generate(() -> radom.nextInt(1, 500)).limit(90).distinct().forEach(System.out::println);
    }
}
