package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        // Java 1.4 == List nomes = new ArrayList(), podia adcionar qualquer coisa
        // com <> força em tempo de compilação a passagem de paramentros

        nomes1.add("William");
        nomes1.add("Dev Dojo");
        nomes2.add("William");
        nomes2.add("Academy");

        // nomes1.addAll(nomes2);

        // System.out.println(nomes1.remove("william")); // index or Object

        for (String nome : nomes1) {
            System.out.println(nome);
        }
        System.out.println("=====================");

        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));

        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1); // Autoboxing
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);

        for (String nome : nomes2) {
            if (!nomes1.contains(nome)) {
                nomes1.add(nome);
            }
        }
        System.out.println(nomes1);
    }


}

