package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Thinkpad I7", 11000);
        Tomate tomate = new Tomate("Cereja", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("=======================");
        CalculadoraImposto.calcularImposto(tomate);


    }
}
