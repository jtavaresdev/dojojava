package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysEx2 {
    public static void main(String[] args) {
        int soma = 0;
        int[] numeros = {10, 4, 8, 10};

        for (int p : numeros) {
            soma += p;
        }
        System.out.println("O valor da soma da lista é igual a " + soma);
    }
}
