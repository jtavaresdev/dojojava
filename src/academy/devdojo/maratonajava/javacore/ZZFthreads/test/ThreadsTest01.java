package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread{
    private char c;

    public ThreadExample(char c){
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
        }
    }
}
class ThreadExampleRunnable implements Runnable{
    private char c;

    public ThreadExampleRunnable(char c){
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
        }
    }
}

// Threads tipo Daemon x User

public class ThreadsTest01 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExampleRunnable('A'));
        Thread t2 = new Thread(new ThreadExampleRunnable('B'));
        Thread t3 = new Thread(new ThreadExampleRunnable('C'));
        Thread t4 = new Thread(new ThreadExampleRunnable('D'));
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
