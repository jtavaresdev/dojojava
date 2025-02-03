package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Joao");

        t1.start();
        t2.start();


    }
    private synchronized void withdrawal(int amount){
        if(account.getBalance() >= amount){
            System.out.println(getName() + " Está indo sacar o dinheiro ");
            account.withdrawal(amount);
            System.out.println(getName() + " completou o saque, valor atual da conta: "+ account.getBalance());
        }
        else {
            System.out.println("Sem dinheiro para: "+ getName() + "Efetuar o saque "+account.getBalance());
        }
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("FODEO");
            }
        }
    }
}
