// Ejercicio 7

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un valor n: ");
        int n = sc.nextInt();
        
        long resultado = resolverFactorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);

        sc.close();
    }
    
    public static long resolverFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * resolverFactorial(n - 1);
        }
    } 
}
