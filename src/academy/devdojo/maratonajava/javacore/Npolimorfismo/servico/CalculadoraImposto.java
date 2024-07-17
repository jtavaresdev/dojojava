package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        double total = imposto + produto.getValor();
        System.out.println("Nome: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto: "+imposto);
        System.out.println("Total: "+total);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataDeValidade();
            System.out.println("Data de Validade: "+ dataValidade);
        }
    }
}
