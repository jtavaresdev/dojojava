package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Membros;

public class EmailDeliveryService implements Runnable{
    private final Membros membros;

    public EmailDeliveryService(Membros membros) {
        this.membros = membros;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" starting to delivery emails");
        while (membros.isOpen() || membros.pendingEmails() > 0){
            try {
                String email = membros.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " Enviando email para: "+email);
                Thread.sleep(2000);
                System.out.println(threadName + " Enviando email com sucessor para"+ email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso");
    }
}
