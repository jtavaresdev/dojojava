package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
// FileWriter
// FileReader
// Buffered Writer
// Buffered Reader

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try (FileWriter fileWriter = new FileWriter(file);) {
            fileWriter.write("O dev dojo é bom");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
