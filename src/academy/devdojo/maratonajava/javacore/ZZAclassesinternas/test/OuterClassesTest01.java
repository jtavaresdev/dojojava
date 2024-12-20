package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";
    //Nested Classes
    private class Inner{
        public void printOuterClassAttribuite(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        // uma classe dentro da outra
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner1 = outerClasses.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner1.printOuterClassAttribuite();
        inner2.printOuterClassAttribuite();
    }
}
