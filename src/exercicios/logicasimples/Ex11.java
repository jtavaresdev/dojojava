package exercicios.logicasimples;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine().trim();
        System.out.print("Digite a nota1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("Digite a nota2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("Digite a nota3: ");
        double nota3 = teclado.nextDouble();
        System.out.print("Digite a nota4: ");
        double nota4 = teclado.nextDouble();
        aprovado(nota1, nota2, nota3, nota4, nome);

    }

    public static void aprovado(double nota1,double nota2, double nota3, double nota4, String nome){
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        if (media < 7){
            System.out.println("Aluno: "+nome);
            System.out.println("Media: "+media);
            System.out.println("Situação: Reprovado ");
        }else {
            System.out.println("Aluno: "+nome);
            System.out.println("Media: "+media);
            System.out.println("Situação: Aprovado ");
        }
    }
}
