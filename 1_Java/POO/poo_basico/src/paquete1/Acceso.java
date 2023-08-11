package paquete1;

public class Acceso {
    public static void main(String[] args) {
        Ususario user1 = new Ususario("Christian", "Lima", (byte)35);
        user1.mostrarInfo();
        user1.nombre = "Andres";
    }
}
