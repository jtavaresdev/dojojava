package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "Luffy";
        String nome2 = "   ZORO    ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(1,4));
        System.out.println(numeros.substring(4));
        System.out.println(nome2);
        System.out.println(nome2.trim());

    }
}
