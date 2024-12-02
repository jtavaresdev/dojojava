package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoad;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;

public class DatabaseLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        databaseLoader.checkPermission();
        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.retrieveMaxDataSize();
    }
}
