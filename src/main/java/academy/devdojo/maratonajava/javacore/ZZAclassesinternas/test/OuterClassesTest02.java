package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Kamina";

    void print() {
        String lastName = "Gurren"; // TEM QUE SER FINAL OU EFETIVAMENTE FINAL
        // metodos ou blocos de inicializacao
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " "+ lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClasses = new OuterClassesTest02();
        outerClasses.print();
    }
}
