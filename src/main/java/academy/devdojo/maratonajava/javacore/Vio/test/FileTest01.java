package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/joao/Área de trabalho/projects/dojojava-master/arquivo/teste");
        try {
            //file.exists(); file.delete(); ....
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
