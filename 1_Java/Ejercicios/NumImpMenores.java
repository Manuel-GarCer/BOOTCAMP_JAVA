// Ejercicio 4

import java.util.Scanner;

public class NumImpMenores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero n: ");
        int n = sc.nextInt();

        System.out.println("Numeros impares menores a " + n + ":");
        for (int i = 1; i < n; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
