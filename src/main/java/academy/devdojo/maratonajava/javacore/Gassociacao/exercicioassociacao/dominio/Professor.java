package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void imprime() {
        System.out.println("=========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) {
            System.out.println("Seminário não encontrado");
            return;
        }
        System.out.print("Seminarios: ");
        for (Seminario s : seminarios) {
            System.out.print(s.getTitulo() + ", ");
            System.out.println("Alunos:");
            if (s.getLocal() == null) {
                System.out.println("Não consta local");
            } else {
                System.out.println("Local: " + s.getLocal().getEndereco());
            }
            if (s.getAlunos() == null || s.getAlunos().length == 0) {
                System.out.println("Nenhum aluno cadastrado.");
                return;
            }
            for (Aluno a : s.getAlunos()) {
                System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
            }
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
