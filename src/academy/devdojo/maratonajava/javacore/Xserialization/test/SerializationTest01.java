package academy.devdojo.maratonajava.javacore.Xserialization.test;

import academy.devdojo.maratonajava.javacore.Xserialization.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(122L, "Joao Tavares", "doido123");
        Turma turma = new Turma("Introdução ao Estelionato");
        aluno1.setTurma(turma);
        serializar(aluno1); // Persistir com bytes stream
        desSerializar(); // quando deserializa não passa pelo construtor do objeto


    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desSerializar() {
        Path path = Paths.get("folder/aluno.ser");
        // aluno salvo
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
