package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private static final int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado de espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicialiado com valores  default ou oque é passado
    // 3 - Bloco de inicializzzação é executado
    // 4 - Construtor é executado
    // OBS> ATÉ ENTÃO NOS MEUS ESTUDOS;

    private String nome;

    public Anime() {
        for (int i : Anime.episodios) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {

        return episodios;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
