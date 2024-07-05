package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario02 {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios != null) {

            for (double v : salarios) {
                System.out.print("R$" + v + " ");
            }
            mediaSalarial(salarios);
        }
    }

    public void mediaSalarial(double... salarios) {
        if (salarios == null) {
            return;
        }
        media = 0;
        for (double num : salarios) {
            media += num;
        }
        media = media / salarios.length;
        System.out.println("\nA média salárial é de R$" + media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
