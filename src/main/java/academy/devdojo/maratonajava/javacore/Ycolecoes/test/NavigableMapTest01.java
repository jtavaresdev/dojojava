package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        // NavigableMap, o Comparable ou Comparator é para a chave.
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : "+entry.getValue());
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println(map.headMap("C", true));
        System.out.println(map.headMap("C", false));
        System.out.println(map.lowerKey("D"));


    }
}
