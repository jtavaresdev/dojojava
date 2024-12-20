package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponivels = new ArrayList<>(List.of(new Carro("Uno"), new Carro("Cerato")));
        List<Barco> barcosDisponivels = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponivels);
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponivels);

        Barco barco = rentalServiceBarco.retrieveAvailableCar();
        Carro carro = rentalServiceCarro.retrieveAvailableCar();
        rentalServiceCarro.returnCarRented(carro);
        rentalServiceBarco.returnCarRented(barco);

    }

}
