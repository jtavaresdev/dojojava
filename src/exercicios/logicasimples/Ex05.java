package exercicios.logicasimples;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salQuantidade;
        double salarioMinimo = 1412;
        System.out.print("Digite o valor de seu salário: ");
        double salario = teclado.nextDouble();
        salQuantidade = salario / salarioMinimo;
        System.out.println(salQuantidade);

    }
}
