package exercicios.logicasimples;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em F°: ");
        double fahrenheit = teclado.nextDouble();
        //double c = converterParaCelsius(fahrenheit);
        System.out.println("F°: "+fahrenheit);
        System.out.println("C°: "+converterParaCelsius(fahrenheit));

    }
    public static double converterParaCelsius(double f){
        return -1 *((5*(32 - f)/9));
    }
}
