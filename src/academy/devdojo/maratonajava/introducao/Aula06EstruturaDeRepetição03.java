package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição03 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valor da parcela tem que ser >= a 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Pagar de " + parcela + " prestação R$ " + valorParcela);
            } else {
                break;
            }
        }
    }
}
