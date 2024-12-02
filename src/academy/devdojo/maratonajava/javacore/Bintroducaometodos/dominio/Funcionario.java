package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void mediaSalarial() {
        if (salario == null) {
            System.out.println("Salário inválido.");
            return;
        }
        for (double t : this.salario) {
            media += t;
        }
        media /= this.salario.length;
        System.out.println("\nMedia = " + media);

    }

    public void imprime() {
        System.out.println("===========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            System.out.println("Salário inválido");
            System.out.println("===========================");
            return;
        }
        System.out.print("Salário: ");
        for (double din : salario) {
            System.out.print(din + " ");
        }
        mediaSalarial();
        System.out.println("===========================");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
