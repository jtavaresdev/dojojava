package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoad {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissão");
    }
    default void retrieveMaxDataSize(){
        System.out.println(MAX_DATA_SIZE);
    }


}
