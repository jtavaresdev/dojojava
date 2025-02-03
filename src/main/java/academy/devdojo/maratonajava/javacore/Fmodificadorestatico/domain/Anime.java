package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - bloco de inicialização STATIC quando a JVM carregar a classe
    // 1 - Alocado espaço em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou oque foi passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático");
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }
    {
        System.out.println("Dentro do bloca de inicialização não estático");
    }

    public Anime() {
        for (int i : episodios) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
