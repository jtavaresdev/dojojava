package academy.devdojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    //parametros polimórficos

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if (produto instanceof Tomate) {
            System.out.println("Data de Validade: " + ((Tomate) produto).getDataDeValidade());
        }
    }
}
