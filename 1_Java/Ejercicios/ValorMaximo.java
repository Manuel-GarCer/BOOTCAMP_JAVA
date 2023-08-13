//  Ejercicio 8

import java.util.Scanner;

public class ValorMaximo {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println();
        System.out.println("El valor mas grande es: " + max);

        sc.close();
    }
}
