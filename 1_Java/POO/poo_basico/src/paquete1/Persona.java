package paquete1;

public class Persona {
    protected String nombre; // protected solo las hijas unicamente pueden acceder
    protected byte edad;

    Persona(String nombre, byte edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
