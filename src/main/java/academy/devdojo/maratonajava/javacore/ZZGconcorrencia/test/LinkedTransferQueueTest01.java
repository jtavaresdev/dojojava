package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Objects;
import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
//        LinkedTransferQueue = União dessas outras
//        Blockear e nao bloquear
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("JOAO"));
        System.out.println(tq.offer("JOAO")); //Se tiver espaço add se nao lança exception
        System.out.println(tq.offer("JOAO", 10, TimeUnit.SECONDS)); //Se tiver espaço add se nao lança exceptiont
        tq.put("É");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Tavares");
        }
        System.out.println(tq.tryTransfer("Neto"));
        System.out.println(tq.element()); //if list is null 
        System.out.println(tq.remainingCapacity());
    }
}
