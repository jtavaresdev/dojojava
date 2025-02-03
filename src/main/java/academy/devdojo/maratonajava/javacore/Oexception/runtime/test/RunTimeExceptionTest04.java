package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import javax.management.RuntimeErrorException;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {


        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }


        try{
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e ){
            e.printStackTrace();
        }

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
