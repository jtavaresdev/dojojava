package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os dados do PRIMEIRO carro: ");
        System.out.print("Nome: ");
        carro1.nome = teclado.next();
        System.out.print("Modelo: ");
        carro1.modelo = teclado.next();
        System.out.print("Ano: ");
        carro1.ano = teclado.nextInt();

        System.out.println("Digite os dados do SEGUNDO carro: ");
        System.out.print("Nome: ");
        carro2.nome = teclado.next();
        System.out.print("Modelo: ");
        carro2.modelo = teclado.next();
        System.out.print("Ano: ");
        carro2.ano = teclado.nextInt();

        System.out.println("+++++Carro 1++++++");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("+++++Carro 2++++++");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
        System.out.println("+++++++++++++++++++");
    }
}
