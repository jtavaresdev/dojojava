package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 5.88D;
        });
        System.out.println(doSomething());
        Double dolarResponse = null;
        try {
            dolarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
            executorService.shutdown();
        }
        System.out.println("Dolar: "+dolarResponse);

    }

    public static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long num = 0;
        for (int i = 0; i < 1_000_000; i++) {
            num += i;
        }
        return num;
    }
}
