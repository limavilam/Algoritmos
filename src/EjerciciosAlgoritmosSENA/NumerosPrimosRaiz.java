package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class NumerosPrimosRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número que quiere verificar si es primo:");
        int numeroInteres = scanner.nextInt();


        int limite = (int) Math.sqrt(numeroInteres);
        System.out.println("La cantidad de divisores para el número de interés es: " + limite);
        int contadorDivisores = 0;

        for (int i = 2; i < limite; i++) { //Se descarta el 1 porque todos son divisibles en 1
            if (numeroInteres % i == 0) {
                System.out.println("Divisor encontrado: " + i);
                contadorDivisores++;
            }
        }
        if (contadorDivisores == 0) {
            System.out.println("El número " + numeroInteres + " es primo.");
        } else {
            System.out.println("El número " + numeroInteres + " no es primo.");
        }
    }
}
