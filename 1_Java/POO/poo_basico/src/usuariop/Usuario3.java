package POO.poo_basico.src.usuariop;

public class Usuario3 extends Persona {
    protected String codigo;
    protected String username;

    Usuario3(String nombre, byte edad, String codigo, String username) {
        super(nombre, edad);
        this.codigo = codigo;
        this.username = username;
    }



}
