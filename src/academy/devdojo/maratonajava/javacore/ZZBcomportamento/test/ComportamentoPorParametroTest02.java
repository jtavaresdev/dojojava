package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019), new Car("green", 2010));

    public static void main(String[] args) {
        List<Car> carsBefore2015 = filter(carList, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2015;
            }
        });
        carsBefore2015 = filter(carList, car -> car.getYear() < 2015); // LAMBDA
        System.out.println(carsBefore2015);

    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>(1);
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
