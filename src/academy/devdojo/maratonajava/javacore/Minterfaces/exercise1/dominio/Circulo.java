package academy.devdojo.maratonajava.javacore.Minterfaces.exercise1.dominio;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area;
        area = 3.14 * raio*raio;
        System.out.println("Area: "+area);

    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = 2* raio * 3.14;
        System.out.println("Perimetro: "+perimetro);
    }
    public void calcular(){
        calcularArea();
        calcularPerimetro();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
