package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        // tipos primitovos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // objetos wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Character charW2 = '3';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("12345");
        System.out.println(intW2);
        Boolean isTrue = Boolean.parseBoolean("true");
        Boolean isTrue2 = Boolean.parseBoolean("TRUE");
        System.out.println(isTrue);
        System.out.println(isTrue2);

        System.out.println(Character.isDigit(charW));
        System.out.println(Character.isDigit(charW2));
    }

}
