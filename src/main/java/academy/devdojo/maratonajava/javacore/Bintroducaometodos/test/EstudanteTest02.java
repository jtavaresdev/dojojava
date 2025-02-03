package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        estudante.nome = "Nano Nakano";
        estudante.idade = 15;
        estudante.sexo = 'F';

        estudante1.nome = "Futaro";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante1.imprime();
        estudante.imprime();
    }
}
