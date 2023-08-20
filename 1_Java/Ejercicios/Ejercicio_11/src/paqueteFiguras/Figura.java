package paqueteFiguras;

public class Figura {
    private String color;
    private boolean rellena;

    public Figura(String color, boolean rellena) {
        this.color = color;
        this.rellena = rellena;
    }

    // Getters y setters para color y si está rellena
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    // Método para calcular el área (se implementará en las clases derivadas)
    public double calcularArea() {
        return 0.0;
    }

    // Método para calcular el perímetro (se implementará en las clases derivadas)
    public double calcularPerimetro() {
        return 0.0;
    }
}

