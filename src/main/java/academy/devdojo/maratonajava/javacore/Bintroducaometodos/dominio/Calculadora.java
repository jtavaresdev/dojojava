package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // PODE PASSAR DIFERENTE TIPOS
    public void multiplicaDoisNumeros(int a, int b) {
        int m = a * b;
        System.out.println(a + " x " + b + " = " + m);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println(soma);
    }

}
