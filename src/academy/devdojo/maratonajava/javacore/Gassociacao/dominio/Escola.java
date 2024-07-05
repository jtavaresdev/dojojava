package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professors;

    public Escola(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (this.professors == null) return;
        for (Professor professor : professors) {
            System.out.println(professor.getNome() + " | Disciplina: " + professor.getDisciplinas());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
