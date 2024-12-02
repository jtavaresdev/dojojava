package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Joao");
        funcionario1.setIdade(22);
        funcionario1.setSalario(new double[]{5456.7, 5996.90, 5234.5, 4998.3});

        funcionario1.imprime();


    }
}
