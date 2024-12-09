package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;

public class PosixFileAttribuitesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/joao/sql/teste.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        UserPrincipal owner = posixFileAttributes.owner();
        System.out.println(owner);
        System.out.println(posixFileAttributes.permissions());
    }
}
