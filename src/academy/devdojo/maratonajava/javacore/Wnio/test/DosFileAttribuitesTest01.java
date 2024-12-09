package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttribuitesTest01 {
    // Trabalhar no Windows.
    // Não funciona no meu Ubuntu de cria
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/teste.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fileAttributeView.setHidden(false);
        fileAttributeView.setReadOnly(false );

        System.out.println(dosFileAttributes.isArchive());
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());
        System.out.println(dosFileAttributes.size());

    }
}
