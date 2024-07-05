package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionaisEx1 {
    public static void main(String[] args) {
        String[][] pessoas = new String[3][2];
        pessoas[0][0] = "MIdorya";
        pessoas[0][1] = "22";
        pessoas[1][0] = "Bakugo";
        pessoas[1][1] = "24";
        pessoas[2][0] = "Toyohisa";
        pessoas[2][1] = "54";
        int count = 0;
        for (String[] pessoaBase : pessoas) {
            for (String p : pessoaBase) {
                System.out.printf(p);
                System.out.print(" ");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }

            }
        }
    }
}
