package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Joao"; // String pool
        String nome2 = "Joao";
        String nome3 = new String("Joao");// Heap - Cria um objeto com uma ref em memoria
        

        System.out.println(nome2 == nome);
        System.out.println(nome == nome3);
    }
}
