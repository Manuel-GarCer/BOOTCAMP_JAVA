package paquete1;

public class Ususario {
   String nombre;
   String ciudad;
   byte edad;

   public Ususario(String nombre, String ciudad, byte edad){
    System.out.println("Hola desde el contructor");
    this.nombre = nombre;
    this.ciudad= ciudad;
    this.edad = edad;
   }

   public void mostrarInfo(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Ciudad: "+ciudad);
    System.out.println("Edad: "+edad);
   }
   public int holaNveces(int n){
    for (int i = 0; i < n i++) {
        System.out.println("Hola");
        
    }
   }
}
