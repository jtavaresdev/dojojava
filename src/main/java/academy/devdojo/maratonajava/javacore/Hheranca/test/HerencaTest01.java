package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerencaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-520");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("12231233-90");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Joao Tavares", 5456.78);
        funcionario.setCpf("1235678-21");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.relatorio();

    }
}
