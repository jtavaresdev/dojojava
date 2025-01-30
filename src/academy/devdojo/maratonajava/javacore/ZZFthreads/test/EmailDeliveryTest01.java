package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Membros;
import academy.devdojo.maratonajava.javacore.ZZFthreads.services.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Membros membros = new Membros();

        Thread jiraya = new Thread(new EmailDeliveryService(membros), "Jiraya");
        Thread sasuke = new Thread(new EmailDeliveryService(membros), "Sasuke");
        jiraya.start();
        sasuke.start();
        while (true){
            String s = JOptionPane.showInputDialog("Entre com seu email: ");
            if (s == null || s.isEmpty()){
                membros.close();
                break;
            }
            membros.addMemberEmail(s);
        }
    }
}
