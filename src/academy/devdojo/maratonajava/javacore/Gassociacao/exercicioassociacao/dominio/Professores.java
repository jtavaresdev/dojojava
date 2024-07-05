package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio;

public class Professores {
    private String nome;
    private String especilidade;
    private Seminario[] seminarios;

    public Professores(String nome, String especilidade) {
        this.nome = nome;
        this.especilidade = especilidade;
    }

    public void imprime() {
        System.out.println("================");
        System.out.println("PROFESSORES");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especilidade: " + this.especilidade);
        if (seminarios == null) return;
        for (Seminario seminario : seminarios) {
            System.out.println("Seminários: " + seminario.getTitulo());

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
