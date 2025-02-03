package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição01 {
    public static void main(String[] args) {
        // while, do while , for
        int count = 12;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do 'DO WHILE'");
        } while (count < 10);
        // do while executa pelo menos 1 vez independente da estrutura lógica

        for (int i = 0; i <= 10; i++) {
            System.out.println("For: "+ i);
        }
    }
}
