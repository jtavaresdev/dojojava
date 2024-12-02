package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader  implements DataLoad, DataRemove{

    @Override
    public void load() {
        System.out.println("Carregando arquivos.");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos.");
    }

    @Override
    public void retrieveMaxDataSize() {
        System.out.println(DataLoad.MAX_DATA_SIZE);
    }
}
