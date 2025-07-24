package sena.ejercicios.guia3;

//Escriba un programa que lea dos vectores de números enteros ordenados ascendentemente y luego
//produzca la lista ordenada de la mezcla de los dos, por ejemplo, si los dos arreglos tienen los números 1
//3 6 9 17 y 2 4 10 17, respectivamente, la lista de números en la pantalla debe ser 1 2 3 4 6 9 10 17 17.
//Limite los vectores a un tamaño de 5 y debe validar en cada ingreso que realmente se estén ingresando
//los datos de forma ascendente.

import java.util.Arrays;
import java.util.Scanner;

public class AscedenteOrdenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arregloA = new int[5];
        int[] arregloB = new int[5];
        int[] arregloCombinado = new int[10];

        System.out.println("Ingrese 5 números para el arreglo A (en orden ascendente):");
        for (int i = 0; i < arregloA.length; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                if (i > 0 && numero < arregloA[i - 1]) {
                    System.out.println("El número debe ser mayor o igual que el anterior (" + arregloA[i - 1] + ")");
                } else {
                    System.out.println("Posición arreglo: " + arregloA[i]);
                    arregloA[i] = numero;
                    System.out.println(numero);
                    break;
                }
            } while (true);
        }

        System.out.println("Ingrese 5 números para el arreglo B (en orden ascendente):");
        for (int i = 0; i < arregloB.length; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                if (i > 0 && numero < arregloB[i - 1]) {
                    System.out.println("El número debe ser mayor o igual que el anterior (" + arregloB[i - 1] + ")");
                } else {
                    System.out.println("Posición arreglo: " + arregloB[i]);
                    arregloB[i] = numero;
                    System.out.println(numero);
                    break;
                }
            } while (true);
        }

        arregloCombinado= combinarOrdenados(arregloA, arregloB);
        System.out.println("El arreglo combinado es: " + Arrays.toString(arregloCombinado));
    }

    public static int[] combinarOrdenados(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k++] = a[i++];
            }else{
                resultado[k++] = b[j++];
            }
        }
        while (i < a.length) {
            System.out.println(resultado[k++]);
        }
        while (j < b.length) {
            resultado[k++] = b[j++];
        }

        return resultado;
    }
}
