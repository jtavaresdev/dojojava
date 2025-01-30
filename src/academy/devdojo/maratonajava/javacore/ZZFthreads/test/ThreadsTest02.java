package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExampleRunnable1 implements Runnable{
    private String c;

    public ThreadExampleRunnable1(String c){
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i<= 500; i++){
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}

// Yield -> JVM Scheduler back to runnable, dar a vez
// Join -> Quando uma thread precisa terminar para outra começar

public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable1("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable1("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();
        t2.start();

    }
}
