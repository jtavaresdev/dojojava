package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTImeExceptionTest04 {
    public static void main(String[] args) {
        // Em multiplos "catch", colocar as Exception genéricas ao final

       try{
            throw new IndexOutOfBoundsException();
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Dentro do ArrayIndexOutOfBoundsException ");
       }catch (IndexOutOfBoundsException e){
        System.out.println("Dentro do IndexOutOfBoundsException ");
       }catch (ArithmeticException e){
        System.out.println("Dentro do ArithmeticException ");
       }catch (RuntimeException e){
           System.out.println("Dentro do RunTimeException");
       }
       try {
           talvezLanceException();
       }catch (SQLException e){
           System.out.println("1");
       }catch (FileNotFoundException e) {
           System.out.println("2");
       }
       try{
           talvezLanceException();
       }catch (SQLException e){
           e.printStackTrace();
           System.out.println("SQLException");
       }catch (FileNotFoundException e){
           e.printStackTrace();
           System.out.println("FileNotFoundException");
       }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{
    }

}
