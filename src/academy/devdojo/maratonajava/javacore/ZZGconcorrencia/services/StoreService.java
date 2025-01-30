package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test.CompletableFutureTest01;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();


    public Future<Double> getPricesAsyncFuture(String nameStore){
        System.out.printf("Getting prices sync for store %s%n", nameStore);
        return ex.submit(this::priceGenerator);
    }
    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String nameStore){
        System.out.printf("Getting prices sync for store %s%n", nameStore);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public double getPriceSync(String nameStore){
        System.out.printf("Getting prices sync for store %s%n", nameStore);
        return priceGenerator();
    }


    private double priceGenerator(){
        System.out.printf("%s generating prince %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdowm(){
        ex.shutdown();
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
