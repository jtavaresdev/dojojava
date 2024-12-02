package exercicios.logicasimples;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        a = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        b = teclado.nextInt();
        if (a == b){
            c = a + b;
            System.out.println("A soma desses valores é: "+c);
        }else {
            c = a * b;
            System.out.println("A multiplicação desses valores é: "+c);
        }


    }
}
