package paqueteFiguras;

public class Rectangulo extends Figura {
    private double ancho;
    private double altura;

    public Rectangulo(String color, boolean rellena, double ancho, double altura) {
        super(color, rellena);
        this.ancho = ancho;
        this.altura = altura;
    }

    // Getters y setters para ancho y altura
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementación de métodos para calcular el área y el perímetro del rectángulo
    @Override
    public double calcularArea() {
        return ancho * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }
}
