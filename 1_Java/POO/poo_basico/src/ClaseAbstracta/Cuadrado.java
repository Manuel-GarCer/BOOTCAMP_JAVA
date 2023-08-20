package ClaseAbstracta;

public class Cuadrado extends Figura{

    float lado;
    public Cuadrado(String color, float lado){
        super(color);
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");

    }

    @Override
    public float area() {
        float areCuadrado = lado * lado;
        return areCuadrado;
    }

    @Override
    public void printColor(){
        System.out.println("El color del cuadrado es: " + color);
    }


}
