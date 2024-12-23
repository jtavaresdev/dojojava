package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("William", "Joao", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, (Integer s) -> System.out.print(s + " "));
        forEach(integers, s -> System.out.print(s + " "));

    }

    private static <T> void forEach(List<T> tList, Consumer<T> consumer) {
        for (T e : tList) {
            consumer.accept(e);
        }

    }
}
