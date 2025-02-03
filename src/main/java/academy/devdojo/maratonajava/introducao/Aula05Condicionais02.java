package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05Condicionais02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
