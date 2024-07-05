package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public void imprimirDados() {
        System.out.println("================");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
        System.out.println("================");
    }

    public void mediaSalarial(double... salario) {
        double soma = 0;
        for (double num : salario) {
            soma += num;
        }
        soma = soma / salario.length;
        System.out.println("A média salaria dos funcionários é: R$" + soma);
    }

}
