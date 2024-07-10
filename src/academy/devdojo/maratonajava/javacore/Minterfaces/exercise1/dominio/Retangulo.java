package academy.devdojo.maratonajava.javacore.Minterfaces.exercise1.dominio;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area;
        area = largura*altura;
        System.out.println("Area: "+area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro;
        perimetro = 2 * altura + 2* largura;
        System.out.println("Perímetro: "+perimetro);
    }
    public void calcular(){
        calcularArea();
        calcularPerimetro();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
