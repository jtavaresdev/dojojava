package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String userDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String userDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = teclado.nextLine();
        if(!userDB.equals(userDigitado) || !senhaDB.equals(senhaDigitado)){
            throw new LoginInvalidoException("Usuário ou Senha errado.");
        }else {
            System.out.println("Logado com sucesso");
        }
    }
}
