package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1B");
    }

    public static void bookSeat(String seat){
       AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstace();
        System.out.println(aircraftSingletonEager);
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}

