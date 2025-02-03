package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    // final quando não quer sobrepor metodos ou classe com extends .....
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    //PODE INICIAR DEFAULT, BLOCO DE INICIALIZAÇÃO ESTATICO OU NO CONSTRUTOR

    public final void imprime(){
        System.out.println(this.nome);
        System.out.println(VELOCIDADE_LIMITE);
        System.out.println(this.COMPRADOR.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }
}
