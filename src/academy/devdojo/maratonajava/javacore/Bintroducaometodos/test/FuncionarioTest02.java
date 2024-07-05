package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario02;

public class FuncionarioTest02 {
    public static void main(String[] args) {
        Funcionario02 funcionario0 = new Funcionario02();

        funcionario0.setNome("Joao V. T");
        funcionario0.setIdade(22);
        funcionario0.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario0.imprimirDados();

    }
}
