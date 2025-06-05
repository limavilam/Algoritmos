package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class SumarNumerosCicloWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea sumar:");
        int cantidadNumeros = scanner.nextInt();

        double contador = 0;

        while (contador <= cantidadNumeros) {
            System.out.println("Ingrese el numero que desea sumar:");
            double numero = scanner.nextDouble();
            contador = contador + numero;
        }
        System.out.println("La suma es: "+ contador);


    }
}
