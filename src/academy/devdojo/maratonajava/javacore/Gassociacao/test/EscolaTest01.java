package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Joana D'arc");
        Professor professor2 = new Professor("Lidiana");
        Professor professor3 = new Professor("Ronei");
        Escola escola = new Escola("Juscelino K. De Oliveira");
        professor1.setDisciplinas("Lingua Portuguesa");
        professor2.setDisciplinas("Educação fisica");
        professor3.setDisciplinas("Educação fisica");
        Professor[] profesores = {professor1, professor2, professor3};
        escola.setProfessors(profesores);
        escola.imprime();

    }
}
