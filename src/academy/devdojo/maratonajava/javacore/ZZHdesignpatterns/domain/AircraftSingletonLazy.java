package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    //LAZY INITIALIZATION
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonLazy getInstace() {
//        DOUBLE LOCK
            if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
