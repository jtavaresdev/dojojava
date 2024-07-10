package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    // não precisa escrever public abstract, pois vem por padrão em uma interface.
    // default para não quebrar o codigo e poder sobreescrever na classe desejada
    // todos atributos em uma interface é uma constante


    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Checando permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataLoader");
    }
}
