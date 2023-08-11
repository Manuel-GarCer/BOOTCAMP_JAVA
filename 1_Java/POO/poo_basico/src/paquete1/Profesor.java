package paquete1;

public class Profesor extends Usuario1 {
    byte num_materias_dictadas;
    short honorarios;

    public Profesor (String nombre, byte edad, String codigo, String username, byte num_materias_dictadas, short honorarios){
        super (nombre, edad, codigo, username);
        this.num_materias_dictadas = num_materias_dictadas;
        this.honorarios = honorarios;
    }

    // metodos
    @Override
    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
        System.out.println("Username: " + username);
        System.out.println("Materias actuales: " + num_materias_dictadas);
        System.out.println("Honorarios: " + honorarios);
    }

    
}
