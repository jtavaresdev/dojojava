package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // padrao de inicialização
        // byte, short, int, long, float e double = 0
        //char  '\u0000' ' '
        //boolean  false
        // String  null

        String[] nome = new String[3];

        for (String p : nome) {
            System.out.println(p);
        }

    }
}
