package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // ORDEM DE INICIALIZAÇÃO
        // 0 - Bloco de inicialização estático da superclass quando a JVM carregar a superclasse
        // 1 - Bloco de inicialização estático da subclasse quando a JVM carregar a subclasse
        // 2 - Alocado de espaço em memoria pro objeto da superclasse
        // 3 - Cada atributo da superclasse é criado e inicialiado com valores  default ou oque foi passado
        // 4 - Bloco de inicialização da super classe é executado
        // 5 - Construtor da superclasse é executado
        // 6 - Alocado de espaço em memoria pro objeto da subclasse
        // 7 - Cada atributo da subclasse é criado e inicialiado com valores  default ou oque foi passado
        // 8 - Bloco de inicialização da subclasse é executado
        // 9 - Construtor da subclasse é executado
        // OBS> ATÉ ENTÃO NOS MEUS ESTUDOS;

        Funcionario funcionario = new Funcionario("Jiraya");
        funcionario.imprime();
    }
}
