package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepetição01 {
    public static void main(String[] args) {
        // while, do while , for
        int count = 2;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do 'DO WHILE'");
        } while (count < 10);
    }
}
