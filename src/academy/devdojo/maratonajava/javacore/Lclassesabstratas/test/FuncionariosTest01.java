package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Midorya", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Endevour", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
