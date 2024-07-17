package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTImeExceptionTest03 {
    public static void main(String[] args) {
        // TRY TENTA EXECUTAR
        // CATCH FAZ A TRATATIVA DO ERRO
        //FINALLY SEMPRE É EXECUTADO

        abreConexao2();
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;

    }
    private static void abreConexao2(){
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
