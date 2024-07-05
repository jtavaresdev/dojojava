package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private final int[] episodios;
    // 1 - Alocado de espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicialiado com valores  default ou oque é passado
    // 3 - Bloco de inicializzzação é executado
    // 4 - Construtor é executado
    // OBS> ATÉ ENTÃO NOS MEUS ESTUDOS;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
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
