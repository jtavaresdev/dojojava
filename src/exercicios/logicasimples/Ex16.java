package exercicios.logicasimples;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor dos lados de um triângulo");
        System.out.println("Lado A:");
        double ladoA = teclado.nextDouble();

        System.out.println("Lado B:");
        double ladoB = teclado.nextDouble();

        System.out.println("Lado C:");
        double laddoC = teclado.nextDouble();

        analiseTriangulo(ladoA, ladoB, laddoC);

    }
    public static void analiseTriangulo(double a, double b , double c){
        if(a == b && a == c){
            System.out.println("Triângulo equilátero");
            System.out.println("Todos os lados iguais");
        } else if (a == b | a == c | b == c) {
            System.out.println("Triângulo isósceles");
            System.out.println("Dois lados iguais");
        }else {
            System.out.println("Triângulo escaleno");
            System.out.println("Nenhum lado igual");
        }
    }
}
