package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositorioBancodeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
