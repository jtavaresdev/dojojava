package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoess = List.of(new Gato(), new Gato());

        printConsulta(gatoess);
        printConsulta(cachorros);
    }
    //Type erasure
    // quando <? extendes Animal> é escrito não pode adcionar elementos na lista
    private static void printConsulta(List<? extends Animal> animals) { //subclasses
        // tudo pra baixo, animal => cachorro,animal ... =>
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void prinConsultaAnimal(List<? super  Animal> animals){//superclasses
        // tudo pra cima, cachorro => animal => objects
        Animal animal = new Cachorro();
        Animal animal1 = new Cachorro();
        // POlimorfismo

        for (Object o : animals){
            if (o instanceof Cachorro){
                // bla bla bla
            }
        }
    }
}
