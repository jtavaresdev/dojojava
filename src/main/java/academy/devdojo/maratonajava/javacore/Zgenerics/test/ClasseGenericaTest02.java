package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.retrieveAvailableCar();
        System.out.println("Usando carro por um mês..... ");
        barcoRentavelService.returnCarRented(barco);
        System.out.println("Devolvendo barco alugado");
    }

}
