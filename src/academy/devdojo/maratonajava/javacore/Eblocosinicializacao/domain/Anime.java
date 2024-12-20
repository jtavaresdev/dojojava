package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou oque foi passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
