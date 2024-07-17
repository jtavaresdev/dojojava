package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double TAXA_IMPOSTO_TOMATE = 0.06;
    public String dataDeValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * TAXA_IMPOSTO_TOMATE;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
