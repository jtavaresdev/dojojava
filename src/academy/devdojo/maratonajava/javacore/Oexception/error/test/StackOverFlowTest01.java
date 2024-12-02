package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursivo();
    }

    public static void recursivo(){
        recursivo();
    }
}
