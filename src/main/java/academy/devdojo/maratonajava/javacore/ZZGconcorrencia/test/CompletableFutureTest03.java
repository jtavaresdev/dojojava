package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services.StoreService;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPriceAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPriceAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<String> stores = List.of("Store 1","Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutures = stores.stream().map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s), executorService)).collect(Collectors.toList());

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(prices);
        executorService.shutdown();


        // join não lança exceções to tipo checked
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end - start));

    }
}
