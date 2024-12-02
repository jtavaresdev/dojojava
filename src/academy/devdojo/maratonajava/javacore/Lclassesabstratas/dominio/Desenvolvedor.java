package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
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
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculabonus() {
        this.salario = salario + salario * 0.05;
    }
}
