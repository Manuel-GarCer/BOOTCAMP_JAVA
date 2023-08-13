// Ejercicio 1

import java.util.Scanner;

public class CalculoHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el total de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        
        int salarioPorHora = 40;
        int horasNormales = 40;
        int horasExtrasDobles = 8;
        int horasExtrasTriples = horasTrabajadas - (horasNormales + horasExtrasDobles);
        
        int salarioTotal = 0;
        
        if (horasTrabajadas <= horasNormales) {
            salarioTotal = horasTrabajadas * salarioPorHora;
        } else if (horasTrabajadas <= horasNormales + horasExtrasDobles) {
            salarioTotal = horasNormales * salarioPorHora + (horasTrabajadas - horasNormales) * (salarioPorHora * 2);
        } else {
            salarioTotal = horasNormales * salarioPorHora + horasExtrasDobles * (salarioPorHora * 2) + horasExtrasTriples * (salarioPorHora * 3);
        }
        
        System.out.println("El salario total del trabajador es: $" + salarioTotal);
        
        sc.close();
    }
    
}
