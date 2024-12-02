package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("===================");
        System.out.println("Nome do Seminario: " + this.titulo);
        if (alunos == null) {
            return;
        }
        System.out.println("Alunos cadastrados:");
        for (Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
        if (local == null) {
            return;
        }else {
            System.out.println("Local: "+local.getEndereco());
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
