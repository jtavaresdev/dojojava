package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo oque não for dígito
        // \s = Espaços em branco {\t \n \f \r} representação de espaço em branco
        // \S = Todos os caracters excluindo os  brancos
        // \w = a-z,A-Z, dígitos  e _
        // \W = Tudo que nao for incluido no  \w
        String regex = "\\w";
        String texto = "r567r@233__#4%t7 6qg\ty133vgy";
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
