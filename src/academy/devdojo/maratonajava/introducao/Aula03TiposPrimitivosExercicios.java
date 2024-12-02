package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;
import java.util.Date;

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {
        Date date = new Date();
        String nome = "Subaru";
        String endereco = "Luginica";
        String dataRecieveSalary = String.valueOf(date);
        double salary = 2500d;

        System.out.println("Eu "+nome+" morando no endereço " +endereco+ " confirmo que recebi o salario de R$ " +
                +salary+ " na data "+dataRecieveSalary);

    }
}
