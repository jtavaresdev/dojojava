package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private  double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estatico de funcionarios");
    }
    {
        System.out.println("Dentro do bloco de inicialização1 funcionarios");
    }
    {
        System.out.println("Dentro do bloco de inicialização2 funcionario");
    }

    public Funcionario (String nome){
        super(nome);
        System.out.println("dentro do construtor funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
