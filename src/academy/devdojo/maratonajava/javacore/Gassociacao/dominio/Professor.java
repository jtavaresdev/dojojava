package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String disciplinas;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
}
