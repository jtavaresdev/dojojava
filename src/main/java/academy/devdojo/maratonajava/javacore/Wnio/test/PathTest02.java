package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("folder");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("folder/subfolder/subsubfolder");
        Path pathFile = Paths.get(subPastaPath.toString(), "file.txt");
        Files.createDirectories(subPastaPath);//createDirectories, não lança exceção se já existir ou se faltar alguma pasta pai
        Path pathFile1 = Files.createFile(pathFile); // Igual criateDirecTORY, lança execeção se o arquivo ja existir

    }
}
