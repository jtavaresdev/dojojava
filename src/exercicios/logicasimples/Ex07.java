package exercicios.logicasimples;

public class Ex07 {
    public static void main(String[] args) {
        // 7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
        boolean a = true;
        boolean b = false;
        System.out.println("Ambos os booleans são iguais? "+booleanVerificacao(a, b));

    }

    public static boolean booleanVerificacao(boolean a, boolean b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
