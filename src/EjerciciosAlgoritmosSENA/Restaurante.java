package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes:");
        int cantidadClientes = scanner.nextInt();

        double totalPagos = 0;

        for (int i = 1; i <= cantidadClientes; i++) {
            System.out.print("Ingrese el consumo del cliente " + i + ":");
            double consumo = scanner.nextDouble();

            double pago;
            if (consumo > 50000) {
                pago = consumo * 0.80;
                System.out.println("Descuento del 20%");
            } else {
                pago = consumo;
            }

            System.out.println("Pago del cliente " + i + ": $" + pago);
            totalPagos += pago;
        }

        System.out.print("Total de todos los pagos: $" + totalPagos);
    }
}
