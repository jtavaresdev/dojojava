package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicioC = System.currentTimeMillis();
        concatString(30_000);
        long fimC = System.currentTimeMillis();

        long inicioS = System.currentTimeMillis();
        stringBuilder(1_000_000);
        long fimS = System.currentTimeMillis();

        long inicio0 = System.currentTimeMillis();
        stringBuffer(1_000_000);
        long fim0 = System.currentTimeMillis();

        System.out.println("Tempo gasto para String: "+ (fimC - inicioC)+ "ms");
        System.out.println("Tempo gasto para StringBuilder: "+ (fimS - inicioS)+ "ms");
        System.out.println("Tempo gasto para StringBuffer: "+ (fim0 - inicio0)+ "ms");

    }


    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0, 01, 012, 0123, ...
        }
    }
    private static void stringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); //0, 01, 012, 0123, ...
        }
    }
    private static void stringBuffer (int tamanho){
        // utilizado para multiplas threads
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); //0, 01, 012, 0123, ...
        }
    }


}
