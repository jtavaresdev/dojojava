package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "123345-30");
        Pessoa pessoa1 = new Pessoa("Tomoya");

        pessoa1.setCpf("123.345.666-65");
        pessoa1.setEndereco(endereco);
        Funcionario funcionario = new Funcionario("Bakugo");

        funcionario.setCpf("122345123");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4567.32);
        pessoa1.imprime();
        funcionario.imprime();
    }
}
