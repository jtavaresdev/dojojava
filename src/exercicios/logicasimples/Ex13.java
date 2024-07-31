package exercicios.logicasimples;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();
        System.out.print("Idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
