package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        System.out.println("Digite as informações do PRIMEIRO CARRO");

        System.out.println("Digite o nome do carro: ");
        carro1.nome = input.next();
        System.out.println("Digite o modelo do carro:");
        carro1.modelo = input.next();
        System.out.println("Digite o ano do carro: ");
        carro1.ano = input.nextInt();

        System.out.println("Digite as informações do SEGUNDO CARRO");

        System.out.println("Digite o nome do carro: ");
        carro2.nome = input.next();
        System.out.println("Digite o modelo do carro:");
        carro2.modelo = input.next();
        System.out.println("Digite o ano do carro: ");
        carro2.ano = input.nextInt();

        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

    }
}
