package exercicios.logicasimples;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        a = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        b = teclado.nextInt();
        System.out.println("Digite o valor de C:");
        c = teclado.nextInt();

        int soma = a + b;

        if (soma > c){
            System.out.println("Soma de A + B = "+soma);
            System.out.println("A soma é maior que C");
        }else {
            System.out.println("Soma de A + B = "+soma);
            System.out.println("A soma é menor que C");

        }

    }
}
