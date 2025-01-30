package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public void addMemberEmail (String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+ "Adicionando email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public boolean isOpen() {
        return this.open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void memberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou nome na lista");
            this.emails.add(email);
            this.emails.notifyAll();

        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "checking if there are emails");
        synchronized (this.emails){
            while (this.emails.isEmpty()){
                if(!open)return null;
                System.out.println(Thread.currentThread().getName()+" Não tem email disponivel na lista, entrando no modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName()+" Notificando todo mundo que não estamos pegando nínguem");
            this.emails.notifyAll();
        }
    }


}
