package academy.devdojo.maratonajava.javacore.Minterfaces.exercise1.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.exercise1.dominio.Circulo;
import academy.devdojo.maratonajava.javacore.Minterfaces.exercise1.dominio.Retangulo;

public class FormasGeometricasTest01 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(5, 10);

        circulo.calcular();
        retangulo.calcular();
    }
}
