package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getInstace());
        System.out.println(AircraftSingletonLazy.getInstace());
        // reflex
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("8902-22");
        System.out.println(aircraftSingletonLazy);
    }

    public static void bookSeat(String seat){
        System.out.println(AircraftSingletonLazy.getInstace());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstace();
        System.out.println(aircraft.bookSeat(seat));
    }
}

