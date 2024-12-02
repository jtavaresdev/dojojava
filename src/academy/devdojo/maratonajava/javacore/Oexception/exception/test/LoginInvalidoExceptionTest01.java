package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String userNameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Usuario: ");
        String userNameDigitado = scanner.nextLine();
        System.out.print("Senha:  ");
        String senhaDigitada = scanner.nextLine();
        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Login válido");


    }
}
