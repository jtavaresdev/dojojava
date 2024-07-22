package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Joao";
        nome.concat("DevDojo"); // criando apenas na pool de String
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Joao");
        sb.append(" Tavares");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0,2);
        System.out.println(sb);
    }
}
