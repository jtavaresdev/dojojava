package exercicios.logicasimples;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor:");
        int a = teclado.nextInt();
        int flex = a -1;
        System.out.println("Antecessor: "+flex);
        flex = a + 1;
        System.out.println("Sucessor: "+flex);
    }
}
