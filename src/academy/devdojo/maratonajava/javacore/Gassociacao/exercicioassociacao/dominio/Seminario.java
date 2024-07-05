package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;
    private Professores professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;

    }

    public void imprime() {
        System.out.println("+=+=+=+=+=+=+=+=+");
        System.out.println("SEMINÁRIO");
        System.out.println("Título: " + this.titulo);
        if (this.local.getEndereco() != null) {
            System.out.println("Local: " + local.getEndereco());
        }
        for (Estudante estudante : estudantes) {
            System.out.println("Estudante: " + estudante.getNome());
        }
        if (professor == null) return;
        System.out.println("Professor: " + this.professor.getNome());

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professores getProfessor() {
        return professor;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }
}
