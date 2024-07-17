package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double TAXA_IMPOSTO_COMPUTADOR = 0.21;

    public Computador(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * TAXA_IMPOSTO_COMPUTADOR;
    }
}
