package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo oque não for dígito
        // \s = Espaços em branco {\t \n \f \r} representação de espaço em branco
        // \S = Todos os caracters excluindo os  brancos
        // \w = a-z,A-Z, dígitos  e _
        // \W = Tudo que nao for incluido no  \w
        // []
        // ? - Zero ou uma ocorrência
        // * - Zero ou mais
        // + - Uma ou mais
        // {n,m} - de n até  m
        // ()
        // | ex: o(v|c)0 == ovo | oco
        // $ - fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3 ....

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = " 0x 0X 0XFF 0X1 0XEDF 0x12fG 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("idice: 012345678");
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
