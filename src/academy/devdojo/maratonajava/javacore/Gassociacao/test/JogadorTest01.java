package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        // em ordem de grandeza
        Jogador jogador1 = new Jogador("Louco Abreu");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Maradona");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador j : jogadores) {
            j.imprime();
        }
    }
}
