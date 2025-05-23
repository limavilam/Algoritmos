package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea saber cuántas veces haya números pares:");
        int numero = scanner.nextInt();

        int contadorPares = 0;
        int contadorImpares = 0;

        //Empieza con 1 y es incluyente
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            } else{
                contadorImpares++;
            }
        }
        System.out.println("La cantidad de pares en el número "+ numero +" es: "+ contadorPares);
        System.out.println("La cantidad de impares en el número "+ numero +" es: "+ contadorImpares);
    }
}
