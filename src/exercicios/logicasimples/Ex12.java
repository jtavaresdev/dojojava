package exercicios.logicasimples;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();
        System.out.println("Escolha a forma de pagamento");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                valorProduto = valorProduto * 0.85;
                break;
            case 2:
                valorProduto = valorProduto * 0.9;
                break;
            case 4:
                valorProduto = valorProduto * 1.1;
                break;
            case 3:
            default:
                break;
        }

        if (escolha == 1 | escolha == 2) {
            System.out.println("Valor a ser pago é: " + valorProduto);
        } else if (escolha == 3) {
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor das 2 parcelas: " + valorProduto / 2);
        } else {
            System.out.println("Valor do produto: " + valorProduto);
            System.out.println("Valor das 3 parcelas: " + valorProduto / 3);
        }
    }
}
