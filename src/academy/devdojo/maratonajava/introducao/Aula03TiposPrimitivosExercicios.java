package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {
        String nome = "Subaru";
        String endereco = "Rua Cricaré - 157";
        double salario = 5431.98;
        LocalDate dataRecebimento = LocalDate.now();

        System.out.println("Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário R$:" + salario + ", na data " + dataRecebimento);


    }
}
