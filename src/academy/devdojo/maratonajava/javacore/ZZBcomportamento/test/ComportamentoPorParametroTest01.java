package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> carList = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019), new Car("green", 2010));

    public static void main(String[] args) {
        System.out.println(filterByColorCar(carList, "green"));
        System.out.println(filterByColorCar(carList, "black"));
        System.out.println(filterByYearBefore(carList,2015));
    }

    private static List<Car> filterByColorCar(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>(1);
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>(1);
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
