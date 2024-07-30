package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println("Diretorio criado: "+ mkdir);
        File file = new File(fileDiretorio, "arquivo.txt");

        boolean newFile = file.createNewFile();
        System.out.println("Arquivo criado: "+newFile);

        File fileRenamed = new File(fileDiretorio,"arquivo_renamed.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: "+isRenamed);
    }
}
