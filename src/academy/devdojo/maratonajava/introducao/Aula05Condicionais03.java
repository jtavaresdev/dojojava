package academy.devdojo.maratonajava.introducao;

// AULA SOBRE SINTAXE OPERADOR TERNÁRIO
public class Aula05Condicionais03 {
    public static void main(String[] args) {
        //doar salario se > 5000
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não consigo doar, mas um dia eu vou!! ";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
