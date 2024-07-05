package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] arrayDe5 = {1, 2, 3, 4, 5};
        // ambas funcionam   calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaArray(arrayDe5);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);

    }
}
