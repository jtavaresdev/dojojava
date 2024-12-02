package exercicios.logicasimples;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        // 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
        int a = 1;
        int b = 213;
        int c = 44;
        int[] valores = {a, b, c};

        Arrays.sort(valores);

        System.out.println("Lista em ordem decrescente: "+valores[2]+", "+valores[1]+", "+valores[0]);

    }



}
