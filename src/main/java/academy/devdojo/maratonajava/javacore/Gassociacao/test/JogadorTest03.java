package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Joaozinho");
        Time time1 = new Time("Brasil");
        Jogador[] jogadores = new Jogador[]{jogador, jogador1, jogador2};
        jogador.setTime(time1);
        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);
        System.out.println("===================");
        time1.imprime();
        System.out.println("====================");
        jogador.imprime();
        System.out.println("====================");
        jogador1.imprime();
        System.out.println("====================");
        jogador2.imprime();
    }
}
