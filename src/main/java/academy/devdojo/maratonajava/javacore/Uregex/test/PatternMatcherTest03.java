package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo oque não for dígito
        // \s = Espaços em branco \t, \n, \f, \r
        // \S = Todos os caractres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = tudo oque não for do \w
        // [] = range de caracteres
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "asd @#y717t_2u9 u12";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice:0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");

        }
    }
}
