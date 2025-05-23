package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de notas que desea promediar:");
        int cantidadNotas = scanner.nextInt();

        double contadorNotas = 0;


        for (int i = 0; i < cantidadNotas; i++) {

            System.out.println("Ingrese la nota" + (i + 1) + ":");
            double nota = scanner.nextDouble();
            contadorNotas = nota + contadorNotas;
        }

        System.out.println("Notas total es: "+ contadorNotas);

        double promedioFinal = promedio (contadorNotas, cantidadNotas);
        System.out.println("La nota promedio es: "+ promedioFinal);
    }

    public static double promedio(double suma , int cantidadNotas) {
        return suma / cantidadNotas;
    }


}

