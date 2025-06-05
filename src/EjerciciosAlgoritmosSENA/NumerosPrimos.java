package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número que quiere verificar si es primo:");
        int numeroInteres = scanner.nextInt();

        int contadorDivisores = 0;
        for (int i = 1; i <= numeroInteres; i++) {
            if (numeroInteres % i == 0) {
                contadorDivisores++;
                System.out.println("Divisor exacto: " + i);
                int resultadoDivision = numeroInteres / i;
                System.out.println("Resultado de la división: " + resultadoDivision);
            }
        }
        if (contadorDivisores == 2) {
            System.out.println("El número " + numeroInteres + " es primo.");
        } else {
            System.out.println("El número " + numeroInteres + " no es primo.");
        }
    }
}