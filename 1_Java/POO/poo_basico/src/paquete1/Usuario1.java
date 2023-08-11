package paquete1;

public class Usuario1 extends Persona {
    //atributos
    protected String codigo;
    protected String username;

    public Usuario1(String nombre, byte edad, String codigo, String username){
        super(nombre, edad);
        this.codigo = codigo;
        this.username = username;
    }
    // metodos

    public void showInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
        System.out.println("Username: " + username);
    } 
}
