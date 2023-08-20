package paqueteFiguras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, boolean rellena, double radio) {
        super(color, rellena);
        this.radio = radio;
    }

    // Getter y setter para radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación de métodos para calcular el área y el perímetro del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}