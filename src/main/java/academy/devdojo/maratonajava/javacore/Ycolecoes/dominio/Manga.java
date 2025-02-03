package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;


import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nomeDoManga;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nomeDoManga, double preco) {
        Objects.requireNonNull(id, "ID nulo"); // obrigando que esses valores nao sejam nulos
        Objects.requireNonNull(nomeDoManga, "Nome nulo");
        this.id = id;
        this.nomeDoManga = nomeDoManga;
        this.preco = preco;
    }

    public Manga(Long id, String nomeDoManga, double preco, int quantidade) {
        this(id, nomeDoManga,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nomeDoManga, manga.nomeDoManga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeDoManga);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nomeDoManga='" + nomeDoManga + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoManga() {
        return nomeDoManga;
    }

    public void setNomeDoManga(String nomeDoManga) {
        this.nomeDoManga = nomeDoManga;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // -1 se o this for menor que outroManga
        // se o this == outroManga, return 0
        //positivo se o this > outroManga
//
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
        return this.nomeDoManga.compareTo(outroManga.getNomeDoManga());
//        return Double.compare(preco, outroManga.preco);
//        return this.id.compareTo(outroManga.getId());
    }
}
