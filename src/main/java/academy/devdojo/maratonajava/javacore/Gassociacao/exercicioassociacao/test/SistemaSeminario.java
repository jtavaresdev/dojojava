package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Seminario;

public class SistemaSeminario {
    public static void main(String[] args) {
        Local local1 = new Local("Auditório A");
        Local local2 = new Local("Auditório B");
        Local local3 = new Local("Auditório C");

        Aluno aluno1 = new Aluno("Roberto", 15);
        Aluno aluno2 = new Aluno("Ana", 15);
        Aluno aluno3 = new Aluno("Geovana", 14);
        Aluno aluno4 = new Aluno("Andre", 16);

        Professor professor1 = new Professor("Snape", "Poções");
        Professor professor2 = new Professor("McGonnagol", "Transmutação");
        Professor professor3 = new Professor("Hagrid", "Bestas Mágicas");

        Aluno[] alunosSeminario1 = new Aluno[]{aluno1, aluno4};
        Aluno[] alunosSeminario2 = new Aluno[]{aluno2};
        Aluno[] alunosSeminario3 = new Aluno[]{aluno3};

        Seminario seminario1 = new Seminario("Realizações Mágicas", alunosSeminario1, local1);
        Seminario seminario2 = new Seminario("Defesa contra a arte das trevas", alunosSeminario2, local2);
        Seminario seminario3 = new Seminario("Bestas Mágicas", alunosSeminario3);

        professor1.setSeminarios(new Seminario[]{seminario1});
        professor2.setSeminarios(new Seminario[]{seminario2});
        professor3.setSeminarios(new Seminario[]{seminario3});

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario3);
        aluno4.setSeminario(seminario1);

        professor1.imprime();
        professor2.imprime();
        professor3.imprime();
    }
}
