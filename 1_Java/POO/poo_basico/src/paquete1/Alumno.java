package paquete1;

public class Alumno extends Usuario1 {
    byte num_cursos_actuales;
    short pension;
    byte nota;

    public Alumno(String nombre, byte edad, String codigo, String username, byte num_cursos_actuales, short pension, byte nota){

        super(nombre, edad, codigo, username);
        this.num_cursos_actuales = num_cursos_actuales;
        this.pension = pension;
        this.nota = nota;

    }

    //metodos
    @Override
    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
        System.out.println("Username: " + username);
        System.out.println("Cursos actuales: "+ num_cursos_actuales);
        System.out.println("Pension: " + pension);
        System.out.println("Nota: " + nota);
    }

    
    
}
