package exercicios.logicasimples;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de A:");
        int a = teclado.nextInt();
        System.out.print("Digite o valor de B:");
        int b = teclado.nextInt();
        System.out.println("Antes da troca");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Depois da troca");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        teclado.close();
    }
}
