package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("folder");
        boolean isMkdir = file.mkdir();
        System.out.println(isMkdir);

        File fileArquivoFolder = new File(file, "arquivo.txt");
        boolean isArquivoFolderCreated = fileArquivoFolder.createNewFile();
        System.out.println(isArquivoFolderCreated);
    }
}
