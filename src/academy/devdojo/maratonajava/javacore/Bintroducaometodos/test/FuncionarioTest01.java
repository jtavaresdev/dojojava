package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        funcionario01.nome = "Mike Baguncinha";
        funcionario01.idade = 43;
        funcionario01.salario = 6789.45;

        funcionario02.nome = "Galo Cego";
        funcionario02.idade = 57;
        funcionario02.salario = 1640.45;

        funcionario03.nome = "Pablo Marçal";
        funcionario03.idade = 36;
        funcionario03.salario = 7890.45;

        funcionario01.imprimirDados();
        funcionario02.imprimirDados();
        funcionario03.imprimirDados();

        funcionario03.mediaSalarial(funcionario03.salario, funcionario02.salario, funcionario01.salario);
    }
}
