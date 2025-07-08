package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class BisiestoCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de años bisiestos");

        while (true) {
            System.out.println("Ingrese el año que quiere determinar si es bisiesto:");
            int anio = scanner.nextInt();

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }
    }
}
