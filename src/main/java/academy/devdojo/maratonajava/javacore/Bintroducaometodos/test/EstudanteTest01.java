package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Nano Nakano";
        estudante.idade = 15;
        estudante.sexo = 'F';
        // nunca vou te perdoar futaro por ter escolhido a Yotusba ao inves da Miku ou Nano.
        estudante1.nome = "Futaro";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        impressora.imprime(estudante1);
        impressora.imprime(estudante);
        System.out.println("=========");
        impressora.imprime(estudante1);
        impressora.imprime(estudante);
    }
}
