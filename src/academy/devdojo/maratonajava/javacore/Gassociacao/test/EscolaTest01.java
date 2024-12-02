package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Gojo Sensei");
        Professor professor2 = new Professor("Utahime Sensei");
        Professor professor3 = new Professor("Mei Mei");
        Escola escola = new Escola("Jujutsu Academia Tokyo", new Professor[]{professor1, professor2, professor3});

        escola.imprime();
    }
}
