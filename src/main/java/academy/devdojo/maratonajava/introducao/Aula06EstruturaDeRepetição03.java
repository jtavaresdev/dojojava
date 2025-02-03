package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturaDeRepetição03 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valor da parcela tem que ser >= a 1000
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o valor do carro? ");
        double valorCarro = teclado.nextDouble();
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println(parcela+" parcelas no valor de R$:"+valorParcela);
        }
    }
}
