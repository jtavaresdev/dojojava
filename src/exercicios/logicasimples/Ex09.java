package exercicios.logicasimples;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura*altura);
        imcAnalyse(imc);


    }
    public static void imcAnalyse(double imc) {
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
            System.out.println("IMC: "+ imc);
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
            System.out.println("IMC: "+ imc);
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
            System.out.println("IMC: "+ imc);
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau |");
            System.out.println("IMC: "+ imc);
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau || (severa)");
            System.out.println("IMC: "+ imc);
        } else {
            System.out.println("Obesidade grau ||| (mórbida)");
            System.out.println("IMC: "+ imc);
        }
    }
}
