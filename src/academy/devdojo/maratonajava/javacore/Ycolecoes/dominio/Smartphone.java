package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumer;
    private String marca;

    public Smartphone(String serialNumer, String marca) {
        this.serialNumer = serialNumer;
        this.marca = marca;
    }

    // Reflexivo : x.equals(x) = tem que ser true para tudo que for diferente de null
    // Simétrico : para x e y diferentes de null, se x.equals(y) == true, y.equals(x) tem que ser true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y), logo x.equals(z) == true, logo y.equals(z) tem que ser true
    // Consistente : x.equals(x) sempre tem que retornar true se !x == null

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumer != null && serialNumer.equals(smartphone.serialNumer);
    }

    // Se x.equals(y) -> x.hashCode() = y.hashCode();
    // y.hashCode() == x.hashCode(), NÃO necessariamente o equals entre eles retorna true;
    // x.hashCode() != y.hashCode(), x.equal(y) == false

    @Override
    public int hashCode() {
        if (serialNumer == null) return 0;
        return this.serialNumer.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumer='" + serialNumer + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumer() {
        return serialNumer;
    }

    public void setSerialNumer(String serialNumer) {
        this.serialNumer = serialNumer;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
