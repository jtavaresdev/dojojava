package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(20, 0));
        System.out.println("+++++++++++++++++++");
        calculadora.imprimeDivisaoDoisNumeros(86, 5);
        int a = 20;
        int b = 5;
        calculadora.trocaDoisNumeros(a, b);
        System.out.println("Fora do metodo");
        System.out.println("Num1: " + a);
        System.out.println("Num2: " + b);
    }
}
