package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttribuites, DosFIlesAttribuites,PosixFileAttibuites
        LocalDateTime l1 = LocalDateTime.now().minusDays(10);
        File file = new File("folder/subfolder/subsubfolder/fileNovo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(l1.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder/subfolder/subsubfolder/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(l1.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);

    }
}
