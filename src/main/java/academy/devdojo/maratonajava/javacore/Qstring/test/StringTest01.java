package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // imutabilidade das Strings/ são imutaveis se não utilizar suas referencias
        // Ex: se eu utilizar nome = nome.concat(" Suane"), a referência agora mudaria.
        //nome = nome.concat(" Suane") = nome += " Suane";

        String nome = "William"; // String constant pool
        String nome1 = "William";
        String concat = nome.concat(" Suane");
        String nome2 = new String("William");
        // Quando instanciar um novo objeto, é referenciado no heap e não na pool de String's
        System.out.println(nome);
        System.out.println(concat);
        System.out.println(nome == nome1);
        System.out.println(nome1 == nome2);

        // .equals -> analisar a semantica
        //  ==      -> analisar a referencia de um objeto
        // Nesse caso, na pool de String, existem os nomes:{William, Suane e Willian Suane}

    }
}
