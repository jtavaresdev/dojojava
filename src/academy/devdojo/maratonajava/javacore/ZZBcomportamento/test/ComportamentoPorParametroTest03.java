package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019), new Car("green", 2010));

    public static void main(String[] args) {
        List<Car> carsBefore2015;
        carsBefore2015 = filter(carList, car -> car.getColor().equals("black")); // LAMBDA
        System.out.println(carsBefore2015);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> oddNums = filter(nums, n -> n % 2 == 0);
        System.out.println(oddNums);

    }
    private static <T> List<T> filter(List<T> tList, Predicate<T> tPredicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : tList){
            if (tPredicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}
