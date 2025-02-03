package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        //Type erasure, <> somente em tempo de compilação
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Midorya");


        for (String o : lista ){
            System.out.println(o);

        }
        add(lista, new Consumidor("João"));

        for (String o : lista ){ //Object, executa
            System.out.println(o);

        }
    }
    //    private static void add (List lista, Consumidor consumidor)
    // Se passar sem generics, vc pode passar qualquer tipo de paramentro
    private static void add (List<String> lista, Consumidor consumidor){
        lista.add(consumidor.getNome());
    }
}
