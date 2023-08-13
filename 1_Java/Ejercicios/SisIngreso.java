// Ejercicio 2

import java.util.Scanner;

public class SisIngreso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad del usuario: ");
        int edad = sc.nextInt();

        if (edad >= 15) {
            System.out.print("Inserte 1 si el invitado trajo regalo; caso contrario, inserte 0: ");
            int trajoRegalo = sc.nextInt();

            if (trajoRegalo == 1) {
                System.out.println("El invitado si puede ingresar a la fiesta.");
            } else {
                System.out.println("El invitado no puede ingresar a la fiesta porque no trajo regalo.");
            }
        } else {
            System.out.println("El invitado puede ingresar a la fiesta sin restricciones.");
        }
        sc.close();
    }
}
