package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais04 {

    public static void main(String[] args) {
        // less than 34,712 = 9.70% tax
        //less tan 68,507 = 37.35% TAX
        //>= 68,508 49.50%

        double salarioAno = 70000;
        double taxaDoAno1 = 0.097;
        double taxaDoAno2 = 0.3735;
        double taxaDoAno3 = 0.4950;
        double taxAnual;
        if (salarioAno < 34712){
            taxAnual = salarioAno * taxaDoAno1;
        } else if (salarioAno < 68507) {
            taxAnual = salarioAno * taxaDoAno2;
        }else {
            taxAnual = salarioAno * taxaDoAno3;
        }
        String resultado = "Imposto a ser pago é: "+taxAnual;

        System.out.println(resultado);
    }
}
