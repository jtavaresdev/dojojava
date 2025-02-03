package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("=====================");
        Integer[] numeroArray = new Integer[3];
        numeroArray[0] = 1;
        numeroArray[1] = 2;
        numeroArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numeroArray); //Arrays.asList link no array.
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numeroArray));
        System.out.println(arrayToList);

        System.out.println("=============");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeroArray)); // quebrando o vínculo do Array.asList
        // tem que manter o new ArrayList<>
        numerosList.set(0, 1);
        System.out.println(numerosList);
        System.out.println(Arrays.toString(numeroArray));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6); // pode passar string tb
        List<Integer> integers = List.of(1, 2, 3, 4, 5 );
    }
}
