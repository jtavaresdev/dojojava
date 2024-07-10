package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um Banco de dados");
    }
}
