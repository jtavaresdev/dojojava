package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private  double salario;

    public Funcionario (String nome){
        super(nome);
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
