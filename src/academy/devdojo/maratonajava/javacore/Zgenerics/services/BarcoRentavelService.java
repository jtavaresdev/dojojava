package academy.devdojo.maratonajava.javacore.Zgenerics.services;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponivels = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco retrieveAvailableCar(){
        System.out.println("Buscando Barco disponível");
        Barco c = barcosDisponivels.remove(0);
        System.out.println("Alugando Barco: "+ c);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponivels);
        return c;
    }

    public void returnCarRented(Barco barco){
        System.out.println("Devolvendo Barco: "+ barco);
        barcosDisponivels.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponivels);

    }



}
