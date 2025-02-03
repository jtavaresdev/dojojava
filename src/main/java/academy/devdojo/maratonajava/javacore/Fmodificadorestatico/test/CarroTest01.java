package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Porshe", 320);
        Carro c2 = new Carro("BMW M3", 290);
        Carro c3 = new Carro("Mercedes AMG", 300);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        System.out.println("==================");
        c2.imprime();
        System.out.println("==================");
        c3.imprime();
        System.out.println("Velocida Limite: "+Carro.getVelocidadeLimite());

    }
}
