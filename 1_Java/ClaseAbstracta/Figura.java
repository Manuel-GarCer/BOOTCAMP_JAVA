package ClaseAbstracta;

public abstract class Figura {
    protected String color;

    protected Figura(String color){
        this.color = color;
    }
    proctected abstract void dibujar();
    proctedted abstract float area();

    public void printColor(){
        System.out.println(color);

    }
}
