package interfaces;

public class Gato implements Animal{

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void hacerSonido() {
        System.out.println("miau");

    }

    @Override
    public void dormir() {
        System.out.println("durmiendo")

    }

    @Override
    public void correr() {
        System.out.println("corriendo");

    }
}
