package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da superclasse é executado JVM carregar a classe filha
        // 1 - Bloco de inicialização estático da subclasse é executado JVM carregar a classe pai
        // 2 - Alocado espaço em memoria para o objeto superclasse
        // 3 - Cada atributo de superclasee é criado e inicializado com valores default ou oque foi passado
        // 4 - Bloco de inicialização é executado na superclasse
        // 5 - Construtor da superclasse é executado
        // 6 - Alocado espaço em memoria para o objeto subclasse
        // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou oque foi passado
        // 8 - Bloco de inicialização é executado na subclasseclase
        // 9 - Construtor da subclasse é executado

        Funcionario funcionario = new Funcionario("Joao", 5456.78);

    }
}
