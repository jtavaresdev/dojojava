package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionaisEx1 {
    public static void main(String[] args) {
        String[][] pessoas = new String[3][2];

        pessoas[0][0] = "Midorya";
        pessoas[0][1] = "23";

        pessoas[1][0] = "Bakugo";
        pessoas[1][1] = "24";

        pessoas[2][0] = "Nano Miru";
        pessoas[2][1] = "21";
        int count = 0;
        for(String[] pessoasbase: pessoas){
            for (String p: pessoasbase){
                count++;
                System.out.print(p);
                System.out.print(" ");
                if (count % 2 == 0 && count != 0){
                    System.out.println();
                }
            }
        }

    }
}
