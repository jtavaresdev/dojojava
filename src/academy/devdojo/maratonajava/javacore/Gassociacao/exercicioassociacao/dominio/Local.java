package academy.devdojo.maratonajava.javacore.Gassociacao.exercicioassociacao.dominio;

public class Local {
    private String endereco;
    private Seminario nomeSeminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getNomeSeminario() {
        return nomeSeminario;
    }

    public void setNomeSeminario(Seminario nomeSeminario) {
        this.nomeSeminario = nomeSeminario;
    }
}
