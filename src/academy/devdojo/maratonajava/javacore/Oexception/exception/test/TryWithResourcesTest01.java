package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    //TRY WITH RESORCES FECHA O ARQUIVO SEMPRE PRECISA DO BLOC0  FINALLY
    // SE CRIAR UMA CLASSE, PRECISA IMPLEMENTAR O METODO CLOSEABLE OU AUTOCLOSEABLE
    public static void main(String[] args) {
        lerArquivo1();
    }

    public static void lerArquivo1() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2();) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
