package paquete1;

public class Ususario {
   public String nombre;
   public String ciudad;
   byte edad;
    public static int count = 0;

   public Ususario(String nombre, String ciudad, byte edad){
    System.out.println("Hola desde el contructor");
    this.nombre /*con this hago referencia al nombre de la clase */ = nombre; 
    this.ciudad= ciudad; // con this le digo a java que lo que viene despues del . viene de la clase
    this.edad = edad;
   }

   public Ususario(String nombre, String ciudad){
    this.nombre = nombre;
    this.ciudad = ciudad;
   }



   public void mostrarInfo(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Ciudad: "+ciudad);
    System.out.println("Edad: "+edad);
   }
   public void holaNveces(int n){
    for (int i = 0; i < n; i++) {
        System.out.println("Hola");
        
    }
   }
}
