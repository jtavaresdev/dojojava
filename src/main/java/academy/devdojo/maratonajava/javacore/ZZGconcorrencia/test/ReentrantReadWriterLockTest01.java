package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWriter {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock ral;

    MapReadWriter(ReentrantReadWriteLock ral) {
        this.ral = ral;
    }

    public void put(String key, String value) {
        ral.writeLock().lock();
        try {
            if (ral.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE LOCK %n", Thread.currentThread().getName());

            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            ral.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        ral.readLock().lock();
        try {
            return map.keySet();
        } finally {
            ral.readLock().unlock();
        }
    }
}

public class ReentrantReadWriterLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWriter mapReadWriter = new MapReadWriter(rwl);
        Runnable writer = () -> {
            for (int i = 0; i <= 20; i++) {
                mapReadWriter.put(String.valueOf(i), String.valueOf(i));
            }
        };
        Runnable reader = () -> {
            if (rwl.isWriteLocked()) {
                System.out.println("WRITE LOCKED");
            }
            rwl.readLock().lock();
            System.out.println("FINALLY I GOT THE DAMN LOCK");
            try {
                System.out.println(Thread.currentThread().getName() + mapReadWriter.allKeys());
            }finally {
                rwl.readLock().unlock();
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);
        t1.start();
        t2.start();
        t3.start();
    }

}
