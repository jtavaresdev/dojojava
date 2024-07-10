package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove{
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados de um Banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um Banco de dados.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do Banco de Dados.");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader");
    }
}
