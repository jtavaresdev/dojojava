package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen8",8000);
        Produto produto2 = new Tomate("Tomate Andreia", 6);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("===========");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("==============");
        CalculadoraImposto.calcularImposto(produto2);

    }
}
