import java.util.Scanner;
public class forejercicio {
    public static void main(String[] args) {
        // ejercicicio 1
        // for (int i=0; i<4; i++) {
        //     System.out.println("Hola Mundo");
        // }
        // int contador = 0;
        // while (contador < 4) {
        //     System.out.println("Hola Mundo");
        //     contador++;
        // }
        //=============================================================
        // ejercicio 2
        // System.out.println("Ingrese el valor de n");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // for (int i = 0; i <= n; i++) {
        //     System.out.println(i);
        // }

        // int contador = 0;
        // while (contador <= n) {
        //     System.out.println(contador);
        //     contador++;
        // }
        //===============================================
        // ejercicio 3
        // System.out.println("Ingrese el valor de n");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Números pares menores a " + n + ":");
        // for (int i = 0; i < n; i += 2) {
        //     System.out.print(i + " ");
        // }
        //===============================================
        // ejercicio 4
        // System.out.println("Ingrese el valor de n");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int suma = 0;
        // for (int i = 1; i <= n; i++) {
        //     suma += i;
        // }
        // System.out.println("La suma de los " + n + " primeros números naturales es: " + suma);
        //===============================================
        // ejercicio 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el valor de n");
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         count++;
        //     }
        // }
        // if (count > 2) {
        //     System.out.println("" + n + " no es primo.");
        // }
        // else {
        //     System.out.println("" + n + " es primo.");
        // }

        //===============================================
        // ejercicio 6
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el valor de n");
        // int n = sc.nextInt();
        // int count = 0;
        // int suma = 0;
        // for (int i = 2; i <= n; i++) {
        //     count = 0;
        //     for (int j = 1; j <= i; j++) { // j a va verificar si es primo o no y va hasta el mismo numero
        //         if (i % j == 0) {
        //             count++;
        //         }
        //     }
        //     if (count == 2) {
        //         suma +=i;
        //     }
        // }
        //====================================================================
        // ejercicio 8
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n=sc.nextInt();
        while(n!=1){
            System.out.println("el valor de n es:" +n);
            if(n%2==0){
                n=n/2;    
            }
            else{
                n=3*n+1;
            }
        }
        
        sc.close();
        //System.out.println(suma);
    }                    
    
}

