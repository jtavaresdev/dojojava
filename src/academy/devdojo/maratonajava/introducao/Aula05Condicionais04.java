package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais04 {

    public static void main(String[] args) {
        // less than 34,712 = 9.70% tax
        //less tan 68,507 = 37.35% TAX
        //>= 68,508 49.50%

        double salarioAno = 70000;
        double taxaDoAno1 = 9.7 / 100;
        double taxaDoAno2 = 37.35 / 100;
        double taxaDoAno3 = 49.50 / 100;
        double taxAnual;
        String resultado;

        if (salarioAno <= 34712) {
            taxAnual = salarioAno * taxaDoAno1;
            resultado = "O valor de imposto será de " + taxAnual + " com 9.7% de tax";
        } else if (salarioAno <= 68507) {
            taxAnual = salarioAno * taxaDoAno2;
            resultado = "O valor de imposto será de " + taxAnual + " com 37.35% de tax";

        } else {
            taxAnual = salarioAno * taxaDoAno3;
            resultado = "O valor de imposto será de " + taxAnual + " com 49.50 de tax";
        }

        System.out.println(resultado);
    }
}
