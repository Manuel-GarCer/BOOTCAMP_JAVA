import java.util.Scanner;
public class String1 {
   public static void main(String[] args) {
    String nombre = "Manuel";
    System.out.println(nombre);
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese el valor: ");
    int numero = input.nextInt();
    System.out.println("El valor de la variable es: " + numero);
    System.out.println("ingrese el valor de la variable flotante");
    float numf = input.nextFloat();
    System.out.println("El valor de la variable float es: " + numf);
    System.out.println("ingrese su nommbre y apellido");
    String nombre1 = input.nextLine();
    System.out.println("Nombre: "+ nombre1);

    

    

     

   }
}
