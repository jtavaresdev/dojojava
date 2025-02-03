package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClasssesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walinkg in the shadows");
            }
        };
        animal.walk();
    }
}
