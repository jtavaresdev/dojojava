package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        System.out.println("======================");
        System.out.println("Nome: "+super.nome);
        System.out.println("Salario: "+ super.salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculabonus() {
        this.salario = salario + salario * 0.02;
    }
}
