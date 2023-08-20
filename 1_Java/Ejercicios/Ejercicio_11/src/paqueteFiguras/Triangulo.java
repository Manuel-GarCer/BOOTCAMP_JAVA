package paqueteFiguras;

public class Triangulo extends Figura {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(String color, boolean rellena, double ladoA, double ladoB, double ladoC) {
        super(color, rellena);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Getters y setters para las longitudes de los lados
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    // Implementación de métodos para calcular el área y el perímetro del triángulo utilizando la fórmula de Herón
    @Override
    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2; // Semiperímetro
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}