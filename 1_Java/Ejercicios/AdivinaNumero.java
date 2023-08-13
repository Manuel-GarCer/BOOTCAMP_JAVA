//Ejercicio 10

import java.util.Scanner;

public class AdivinaNumero {
    
    public static void main(String[] args) {

        // Crear un número aleatorio entre 1 y 100
        int number = (int) (Math.random() * 100) + 1;

        // Crear un contador para los intentos
        int intentos = 0;

        // Leer el número del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un numero entre 1 y 100");

        // El juego continúa mientras el jugador no adivine el número
        while (true) {

            // Leer el número del usuario
            int adivina = sc.nextInt();

            // Incrementar el contador de intentos
            intentos++;

            // Comparar el número del usuario con el número aleatorio
            if (adivina == number) {
                System.out.println("Has adivinado el numero, El numero era " + number);
                System.out.println("Numero de intentos: " + intentos);
                break;
            } else if (adivina > number) {
                System.out.println("El numero es demasiado alto.");
            } else {
                System.out.println("El numero es demasiado bajo.");
            }
        }

        sc.close();
    }
}


