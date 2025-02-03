package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Mac Book Air M3", 9000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("======================");
        Produto produto1 = new Tomate("Andreia", 10);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("==============================");
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("==============================");
        CalculadoraImposto.calcularImposto(produto1);
        Televisao televisao = new Televisao("LG SMART 56\"", 4000);
        System.out.println("===================");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
