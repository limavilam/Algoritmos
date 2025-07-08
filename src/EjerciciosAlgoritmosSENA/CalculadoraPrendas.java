package EjerciciosAlgoritmosSENA;

import java.util.Scanner;
//Hacer un programa que sume 5 precios de camisas (en dólares) y que luego muestre el total de la venta en
//pesos.

public class CalculadoraPrendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precioTotal = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Ingrese el precio de la camisa " + i + ":");
            double precioCamisa = scanner.nextDouble();
            precioTotal = precioTotal + precioCamisa;
        }
        System.out.println("El precio total en dolares es: " + precioTotal);
        double precioDolar = conversorDolares(precioTotal);
        System.out.println("El precio en pesos colombianos es: " + precioDolar);
    }

    public static double conversorDolares(double precio) {
        return precio * 4051;
    }
}
