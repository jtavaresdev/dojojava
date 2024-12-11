package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Iphone");
        Smartphone s2 = new Smartphone("1ABC2", "Pixel");
        // Smartphone s2 = s1; (Comparando objeto, para ser igual precisar analisar o endereço em memoria da varial de referencia
        // se for igual como no exemplo retorna True;
        System.out.println(s1.equals(s2));

    }
}
