package EjerciciosAlgoritmosSENA;

//Dado N, escribir el producto desde 1 hasta N.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea determinar su producto:");
        int numeroIngresado = scanner.nextInt();

        int resultado = factorial(numeroIngresado);
        System.out.println("El factorial de " + numeroIngresado + " es: " + resultado);
    }

    public static int factorial(int numero) {
        if (numero == 0){
            return 1;
        }else{
            System.out.println(numero);
            return numero * factorial(numero-1);
        }
    }
}
