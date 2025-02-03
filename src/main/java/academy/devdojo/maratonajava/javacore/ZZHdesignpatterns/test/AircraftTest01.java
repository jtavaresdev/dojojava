package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Aircraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    public static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("P1");
        System.out.println(aircraft.bookSeat(seat));
    }
}

