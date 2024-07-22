package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Joao"; // String constant pool(inside heap) - Joao é criado apenas uma vez. String literal
        String nome2 = "Joao";

        String nome3 = new String("Joao"); // Heap memory - 1 variavel de  ref, 2 - objeto do tipo String, 3 - Uma string no pool de string

        System.out.println(nome2 == nome);
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());
    }
}
