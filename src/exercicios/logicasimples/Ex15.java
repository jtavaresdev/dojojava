package exercicios.logicasimples;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int anoNascimento = teclado.nextInt();
        System.out.println("Digite o mês(NUMERO): ");
        int mes = teclado.nextInt();
        Month mes2 = Month.of(mes);
        System.out.println("Digite o dia: ");
        int dia = teclado.nextInt();
        LocalDate now = LocalDate.now();
        LocalDate nascimento = LocalDate.of(anoNascimento,mes2,dia);
        Period p1 = Period.between(nascimento, now);
        System.out.println("Anos: "+p1.getYears()+" Meses: "+p1.getMonths()+" Dias: "+p1.getDays());
//        System.out.println(nascimento.until(now, ChronoUnit.DAYS));
    }
}
