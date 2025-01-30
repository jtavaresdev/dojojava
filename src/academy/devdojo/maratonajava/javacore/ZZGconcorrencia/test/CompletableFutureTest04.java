package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscountAsyn(service);
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        long init = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesWithDiscount : "+(end - init));
    }
    private static void searchPricesWithDiscountAsyn(StoreServiceWithDiscount service){
        long init = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2", "Store 3", "Store 4");

        List<CompletableFuture<String>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .collect(Collectors.toList());
        collect.stream()
                .map(CompletableFuture::join)
                .forEach(System.out::println);


        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesWithDiscountAsyn : "+(end - init));
    }
}
