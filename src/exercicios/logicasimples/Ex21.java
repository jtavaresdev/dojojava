package exercicios.logicasimples;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite  o valor de A: ");
        int a = teclado.nextInt();
        System.out.print("Digite  o valor de B: ");
        int b = teclado.nextInt();

        System.out.println(a+" / "+b+" = "+a/b);
        System.out.println("Resto: "+a%b);

    }
}
