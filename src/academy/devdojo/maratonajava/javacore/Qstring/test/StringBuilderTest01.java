package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "João Tavares";
        nome.concat("Neto");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("João Tavares");
        sb.append(" Neto");
        System.out.println(sb.reverse());
    }
}
