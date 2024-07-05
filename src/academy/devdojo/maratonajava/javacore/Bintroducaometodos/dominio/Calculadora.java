package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // parametros
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return (int) (num1 / num2);

    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não exite divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }

    }

    public void trocaDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 1;
        System.out.println("Dentro do metodo");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }

}
