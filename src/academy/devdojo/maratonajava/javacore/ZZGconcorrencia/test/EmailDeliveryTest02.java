package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.Membros;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.services.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest02 {
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
