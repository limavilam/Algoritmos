package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class SumaNumerosCicloFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea sumar:");
        int cantidadNumeros = scanner.nextInt();

        double contador = 0;


        for (int i = 0; i < cantidadNumeros; i++) {

            System.out.println("Ingrese el número" + (i + 1) + ":");
            double numero = scanner.nextDouble();
            contador = numero + contador;
        }

        System.out.println("La cantidad total de la suma es: "+ contador);

    }

}
