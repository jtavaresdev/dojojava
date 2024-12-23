package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer apply = numStringToInteger.apply("100");
        System.out.println(apply);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(names, "Veldora"));

    }
}
