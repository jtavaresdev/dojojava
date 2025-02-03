package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

//anonimas, funcoes(n estao atreladas a nenhuma class), conciso

@FunctionalInterface //Interface com apenas 1 metodo abstrato.
// pode ter outros metodos default
public interface CarPredicate {
    boolean test(Car car);

}
