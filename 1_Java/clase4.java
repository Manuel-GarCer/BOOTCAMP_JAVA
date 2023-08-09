public class clase4 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.nombre = "Manuel";
        usuario1.ciudad = "Lima";
        usuario1.edad = 25;
        usuario1.mostrarInfo();

        System.out.println("=====================================================");

        usuario2.nombre = "Juan";
        usuario2.ciudad = "Arequipa";
        usuario2.edad = 15;
        usuario2.mostrarInfo();

   
}
}
