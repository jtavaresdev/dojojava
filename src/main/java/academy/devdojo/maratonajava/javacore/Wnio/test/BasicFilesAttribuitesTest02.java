package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttribuitesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/subfolder/subsubfolder/novo_path.txt");
        BasicFileAttributes fileAttribuites = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = fileAttribuites.creationTime();
        FileTime fileTime1 = fileAttribuites.lastModifiedTime();
        FileTime fileTime2 = fileAttribuites.lastAccessTime();
        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

        Files.getFileAttributeView(path, BasicFileAttributeView.class); //setTime, need FileTime



    }
}
