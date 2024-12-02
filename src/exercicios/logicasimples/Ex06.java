package exercicios.logicasimples;

public class Ex06 {
    public static void main(String[] args) {
        double valor = 1000;
        double valorReajustado = reajusteValor(valor);
        System.out.println("Valor antes do reajuste R$:"+valor);
        System.out.println("Valor ddepois do reajuste R$:"+valorReajustado);
    }
    public static double reajusteValor(double a){
        return  a * 1.05;

    }
}
