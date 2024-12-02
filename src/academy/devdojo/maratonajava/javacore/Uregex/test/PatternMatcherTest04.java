package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo oque não for dígito
        // \s = Espaços em branco \t, \n, \f, \r
        // \S = Todos os caractres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = tudo oque não for do \w
        // [] = range de caracteres
        // ? - Zero ou uma
        // * - Zero ou mais
        // + - Uma ou mais
        // {n,m} de n a m
        // () - agrupamento
        // | Ex: o(v|c)o, ovo, oco.
        // $ - fim da linha
        // . - 1.3 = 123, 1t3, 133, 1@3 , etc....
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, @#$!jotaro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("@#$!jotaro@mail.br".matches(regex)); //matches para validação,

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " + texto2);
        System.out.println("indice:0123456789");
        System.out.println("Regex: " + regex);
        // só encontra a semelhanca, nao valida
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");

        }
    }
}
