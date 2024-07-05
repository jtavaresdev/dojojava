package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio.Seminario;

public class SeminariosTest {
    public static void main(String[] args) {
        Local local01 = new Local("Bloco A");
        Local local02 = new Local("Bloco B");
        Local local03 = new Local("Bloco C");
        Seminario seminario01 = new Seminario("Inteligencia artificial", local01);
        Seminario seminario02 = new Seminario("Herbologia", local02);
        Seminario seminario03 = new Seminario("Defesa contra a artes das Trevas", local03);

        Estudante estudante01 = new Estudante("João", 22);
        Estudante estudante02 = new Estudante("Maria", 18);
        Estudante estudante03 = new Estudante("Evelyn", 17);
        Professores professores1 = new Professores("Snape", "Artes das Trevas");
        Professores professores2 = new Professores("Macgonagol", "Transfiguração");
        Professores professores3 = new Professores("Hagrid", "Animais");

        Estudante[] estudantesSeminario01 = {estudante01, estudante02};
        Estudante[] estudantesSeminario02 = {estudante03, estudante02};
        Estudante[] estudantesSeminario03 = {estudante01, estudante02, estudante03};

        seminario01.setEstudantes(estudantesSeminario01);
        seminario02.setEstudantes(estudantesSeminario02);
        seminario03.setEstudantes(estudantesSeminario03);

        seminario01.setProfessor(professores3);
        seminario02.setProfessor(professores2);
        seminario03.setProfessor(professores1);

        Seminario[] seminariosProfessor01 = {seminario03};
        Seminario[] seminariosProfessor02 = {seminario02};
        Seminario[] seminariosProfessor03 = {seminario01};
        professores1.setSeminarios(seminariosProfessor01);
        professores2.setSeminarios(seminariosProfessor02);
        professores3.setSeminarios(seminariosProfessor03);

        estudante01.setSeminario(seminario01);
        estudante02.setSeminario(seminario02);
        estudante03.setSeminario(seminario03);

        seminario01.imprime();
        seminario02.imprime();
        seminario03.imprime();

        professores1.imprime();
        professores2.imprime();
        professores3.imprime();

        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();
    }
}
