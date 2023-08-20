package ClaseAbstracta;

public class Circulo extends Figura{
    float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }

    @Override
    float area() {
        float areaCirculo =(float)3.14*radio*radio;
        return areaCirculo;
    }

    @Override
    public void printColor(){
        System.out.println("El color del circulo es: "+color);
    }
}
