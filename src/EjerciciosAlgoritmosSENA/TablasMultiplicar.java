package EjerciciosAlgoritmosSENA;

//Realizar un algoritmo que muestre por pantalla la tabla de multiplicar decreciente de cualquier número,
//ingresado entre el 1 y el 10.

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a las tablas de multiplicar (Decreciente)");

        int numero;
        do {
            System.out.println("Ingrese el número que quiere determinar su tabla:");
            numero = scanner.nextInt();
            if (numero > 10 || numero < 1) {
                System.out.println("Ingrese un número entre 1 y 10");
            }else{
                for (int i = 10; i >= 1; i--) {
                    int multiplicador = i * numero;
                    System.out.println(numero + " x " + i + " = " + multiplicador);
                }
            }
        } while (numero > 0);
    }
}
