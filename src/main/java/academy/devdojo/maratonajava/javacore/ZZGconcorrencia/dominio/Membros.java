package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "Adicionando email na lista");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public boolean isOpen() {
        return this.open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();

        }finally {
            lock.unlock();
        }
    }


    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "checking if there are emails");
        lock.lock();
        try {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel na lista, entrando no modo de espera");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.unlock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos pegando nínguem");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }


}
