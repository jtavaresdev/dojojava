package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");
    private final int valor;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoClient:values()) {
            if (tipoClient.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoClient;
            }
        }
        return null;
    }

    public int getVALOR() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
