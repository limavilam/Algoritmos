package EjerciciosAlgoritmosSENA;

//Cuántos digitos tiene un número entero, no se puede convertir a cadena.

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int contadorDigitos = 0;

        while (numero != 0){
            numero = numero / 10;
            contadorDigitos = contadorDigitos + 1;
            System.out.println("Los números digitados son: " + numero);

        }
        System.out.println("La cantidad de números del número ingresado es:" + contadorDigitos);



    }
}
