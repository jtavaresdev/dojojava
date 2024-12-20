package academy.devdojo.maratonajava.javacore.Zgenerics.services;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponivels = new ArrayList<>(List.of(new Carro("Uno"), new Carro("Cerato")));

    public Carro retrieveAvailableCar(){
        System.out.println("Buscando carro disponível");
        Carro c = carrosDisponivels.remove(0);
        System.out.println("Alugando carro: "+ c);
        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponivels);
        return c;
    }

    public void returnCarRented(Carro carro){
        System.out.println("Devolvendo carro: "+ carro);
        carrosDisponivels.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponivels);

    }



}
