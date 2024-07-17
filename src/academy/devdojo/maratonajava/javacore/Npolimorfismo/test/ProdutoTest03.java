package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen8",8000);
        Tomate tomate = new Tomate("Tomate Andreia", 6);
        tomate.setDataDeValidade("15/08/2024");

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("==============");
        CalculadoraImposto.calcularImposto(tomate);


    }
}
