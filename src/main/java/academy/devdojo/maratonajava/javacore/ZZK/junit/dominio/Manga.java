package academy.devdojo.maratonajava.javacore.ZZK.junit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
    // Não pode criar atribudos de isntancia mas pode criar atributos static (de classe)
    public static String producer;
    // Não pode criar blocos de inicialização, mas pode criar blocos de inicialização static
    // Pode utilizar GENERECIS

    // Compact constructor here:
    public Manga{
        Objects.requireNonNull(name);
    }
}
