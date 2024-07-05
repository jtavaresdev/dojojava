package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("João V.");
        Jogador jogador2 = new Jogador("Leonardo Morais");
        Time time = new Time("Brasil");
        jogador1.setTime(time);
        jogador2.setTime(time);

        Jogador[] jogadores = {jogador1, jogador2};
        time.setJogadores(jogadores);

        System.out.println("----Jogador---");

        jogador1.imprime();

        System.out.println("----TIME----");

        time.imprime();
    }
}
