package herenciaMultiple;

public class Avion implements ObjetoVolador, Vehiculo{
    @Override
    public void volar() {
        System.out.println("Avion volando...");
    }

    @Override
    public void encender() {
        System.out.println("Avion encendiendo...");

    }

    @Override
    public void detener() {
        System.out.println("Avion deteniendo..."););

    }
}
