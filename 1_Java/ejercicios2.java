// Ejercicios 2: CONDICIONALES
import java.util.Scanner;
public class ejercicios2 {
    public static void main(String[] args) {
        Scanner eje2 = new Scanner(System.in);
        //==========================================================================
        // Ejercicio 1
        // System.out.println("Ingrese el primer numero");
        // int numero1 = eje2.nextInt();
        // System.out.println("Ingrese el segundo numero");
        // int numero2 = eje2.nextInt(); 
        // if (numero1 == numero2) {
        //     System.out.println("Son iguales");
        // } else {
        //     System.out.println("No son iguales");
        // }
        //==========================================================================
        // Ejercicio 2
        // System.out.println("Ingrese el primer numero");
        // int numero3 = eje2.nextInt();
        // if (numero3 % 2 == 0){
        //     System.out.println("Es par");
        // } else {
        //     System.out.println("Es impar");

        // }
        //==========================================================================
        // Ejercicio 3
        // System.out.println("Ingrese un numero");
        // int numero4 = eje2.nextInt();
        // if (numero4 > 0) {
        //     System.out.println("El número ingresado es positivo.");
        // } else if (numero4 < 0) {
        //     System.out.println("El número ingresado es negativo.");
        // } else {
        //     System.out.println("El número ingresado es cero, que es un valor neutro.");
        // }
        
        // System.out.println("Ingrese un año");
        // int numero5 = eje2.nextInt();
        // if ((numero5 % 4 == 0 && numero5 % 100 != 0) || (numero5 % 400 == 0) ){
        //     System.out.println("El año ingresado es bisiesto.");
        // } else {
        //     System.out.println("El año ingresado no es bisiesto.");
        // }
        //==========================================================================
        // Ejercicio 5
        // System.out.println("Ingrese el primer número");
        // int numero6 = eje2.nextInt();
        // System.out.println("Ingrese el segundo número");
        // int numero7 = eje2.nextInt();
        // System.out.println("Ingrese el tercer número");
        // int numero8 = eje2.nextInt();
        
        //     if (numero6 > numero7 && numero6 > numero8){
        //         System.out.println("El número mayor es " + numero6);
        //     } else if (numero7 > numero6 && numero7 > numero8){
        //         System.out.println("El número mayor es " + numero7);
        //     } else
        //     System.out.println("El número mayor es " + numero8);
        // //==========================================================================
        // Ejercicio 6
        // System.out.println("Ingrese la nota en matematica");
        // int numero9 = eje2.nextInt();
        // System.out.println("Ingrese la nota en fisica");
        // int numero10 = eje2.nextInt();
        // System.out.println("Ingrese la nota en quimica");
        // int numero11 = eje2.nextInt();
        // if((numero9 >= 65 && numero10 >= 55 && numero11 >= 50 && (numero9 + numero10 + numero11) >= 140) || (numero10 + numero9 >= 140)){
        //     System.out.println("El alumno ingreso");
        // } else
        // System.out.println("El alumno no ingreso");
        //==========================================================================
        // Ejercicio 7
        System.out.println("Ingrese la temperatura");
        int numero12 = eje2.nextInt();
        if(numero12 <= 0){
            System.out.println("La temperatura es helada");
        } else if(numero12 > 0 && numero12 <= 10){
            System.out.println("La temperatura es fría");

        } else if(numero12 > 10 && numero12 <= 20){
            System.out.println("La temperatura es Muy fría");
        
        } else if(numero12 > 20 && numero12 <= 30){
            System.out.println("La temperatura es Templado");

        } else if(numero12 > 30 && numero12 <= 40){
            System.out.println("La temperatura es Calor");
        
        }else{
            System.out.println("La temperatura es Mucho calor");
        }
        eje2.close(); //para cerrar
        


    



        
    }
}
