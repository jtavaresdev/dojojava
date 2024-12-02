package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático em FUNCIONARIO");
    }

    {
        System.out.println("BLoco de inicialização NÃO estático em FUNCIONARIO ");
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorio() {
        System.out.println("Eu " + this.nome + " recebi a quantia de R$ " + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
