package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2", "Store 3", "Store 4");

        List<Double> prices = stores.stream()
                .parallel()
                .map(storeService::getPricesAsyncCompletableFuture)
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(prices);
        // join não lança exceções to tipo checked
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %dms%n", (end - start));

    }
}
