package academy.devdojo.maratonajava.javacore.Zgenerics.services;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis ;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retrieveAvailableCar(){
        System.out.println("Buscando veiculos disponível");
        T c = objetosDisponiveis.remove(0);
        System.out.println("Alugando: "+ c);
        System.out.println("Veiculos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return c;
    }

    public void returnCarRented(T objeto){
        System.out.println("Devolvendo: "+ objeto);
        objetosDisponiveis.add(objeto);
        System.out.println("Veiculos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);

    }



}
