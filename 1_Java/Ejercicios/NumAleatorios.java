// Ejercicio 5

import java.util.Random;
import java.util.Scanner;

public class NumAleatorios {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        n = sc.nextInt();

        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("El elemento " + i + " es: " + array[i]);
        }
        sc.close();
    }
}
