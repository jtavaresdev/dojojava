package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services;

import java.util.concurrent.*;

public class StoreServiceDeprecated {

    public double getPriceSync(String nameStore){
        System.out.printf("Getting prices sync for store %s%n", nameStore);
        return priceGenerator();
    }

    private double priceGenerator(){
        System.out.printf("%s generating prince %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
