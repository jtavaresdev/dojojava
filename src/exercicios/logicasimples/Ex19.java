package exercicios.logicasimples;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de um inteiro: ");
        int valor = teclado.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor +" x "+i+" = "+valor*i);
        }
    }
}
