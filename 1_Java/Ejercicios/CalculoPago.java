// Ejercicios 3

import java.util.Scanner;

public class CalculoPago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pagoFijo = 10.00;
        double costoPorLitro;

        System.out.print("Ingrese el total de litros de agua consumidos: ");
        int litrosConsumidos = sc.nextInt();

        if (litrosConsumidos <= 50) {
            costoPorLitro = 0.00;
        } else if (litrosConsumidos <= 200) {
            costoPorLitro = 0.50;
        } else {
            costoPorLitro = 1.50;
        }

        double totalPagar = pagoFijo + (litrosConsumidos - 50) * costoPorLitro;

        System.out.println("El total a pagar por el consumo de agua es: $" + totalPagar);

        sc.close();
    }
}
