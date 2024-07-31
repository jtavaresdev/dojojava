package exercicios.logicasimples;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de um número: ");
        a = teclado.nextInt();
        if (a % 2 == 0){
            System.out.println("É um número par");
        }else {
            System.out.println("É um número impar");
        }
        if (a < 0){
            System.out.println("Número negativo");
        }else {
            System.out.println("Número posivito");
        }
    }
}
