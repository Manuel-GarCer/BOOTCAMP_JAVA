// Ejercicio 9

import java.util.Scanner;

public class InvertirArray {

    public static void main(String[] args) {
        // Declarar la variable n
        int n;

        // Leer el valor de n del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        n = sc.nextInt();

        // Crear un array de tamaño n
        int[] array = new int[n];

        // Llenar el array con números aleatorios
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        // Imprimir el array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Invertir el array
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Imprimir el array invertido
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
