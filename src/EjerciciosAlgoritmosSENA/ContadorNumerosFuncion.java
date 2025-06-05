package EjerciciosAlgoritmosSENA;

//Cuántos digitos tiene un número entero, no se puede convertir a cadena.

import java.util.Scanner;

public class ContadorNumerosFuncion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        contadorDigitos(numero);

    }

    public static int contadorDigitos(int n) {
        int contadorDigitos = 0;

        while (n != 0) {
            n = n / 10;
            contadorDigitos = contadorDigitos + 1;
            System.out.println("Los números digitados son: " + n);

        }
        System.out.println("La cantidad de números del número ingresado es:" + contadorDigitos);
        return contadorDigitos;
    }
}

