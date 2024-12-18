package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização estático em PESSOA");
    }
    {
        System.out.println("BLoco de inicialização NÃO estático em PESSOA ");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }


    public void imprime() {
        System.out.println("=======================");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (endereco == null) {
            return;
        } else {
            System.out.println("Endereço: " + endereco.getRua() + " CEP:" + endereco.getCep());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
