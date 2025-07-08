package EjerciciosAlgoritmosSENA;

//5.	Elaborar un algoritmo que permita ingresar 20 números y muestre todos los números menores e iguales a 25.
import java.util.Scanner;

public class ListadoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] listaNumeros = new int[20];
        int contadorValidos = 0;

        System.out.println("Calculadora de máximos (números menores o iguales a 25):");

        int numeroComparar = 25;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();

            if (numeros[i] <= numeroComparar) {
                System.out.println("Este número entra a la lista.");
                listaNumeros[contadorValidos] = numeros[i];
                contadorValidos++;
            } else {
                System.out.println("Este número es mayor a 25 y no se agrega.");
            }
        }

        System.out.println("Números válidos (menores o iguales a 25):");
        for (int i = 0; i < contadorValidos; i++) {
            System.out.println(listaNumeros[i]);
        }
    }
}

