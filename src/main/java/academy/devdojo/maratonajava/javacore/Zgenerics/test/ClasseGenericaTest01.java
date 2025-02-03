package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.services.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando carro por um mês..... ");
        carroRentavelService.returnCarRented(carro);
        System.out.println("Devolvendo carro alugado");
    }

}
