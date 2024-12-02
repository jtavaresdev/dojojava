package exercicios.logicasimples;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;

        System.out.print("Digite o valor da nota1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite o valor da nota2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite o valor da nota3: ");
        nota3 = teclado.nextDouble();

        mediaNotas(nota1, nota2, nota3);

    }
    public static void mediaNotas(double a,double b ,double c){
        double media = (a+b+c)/3;
        System.out.println("Média das notas: "+media);
    }
}
