package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Count {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);

    public void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.getCount());
        System.out.println(count.getAtomicInteger());

    }
}
