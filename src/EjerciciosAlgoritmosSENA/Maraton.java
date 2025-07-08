package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la calculadora de Km y maratones!");

        while (true) {
            System.out.println("Ingrese el número del horas empleadas en la maraton: ");
            int horasEmpleadas = scanner.nextInt();
            System.out.println("Ingrese el número de minutos empleadas en la maraton: ");
            int minutosEmpleadas = scanner.nextInt();
            if (horasEmpleadas < 0 || minutosEmpleadas < 0) {
                System.out.println("No puede ser negativo.");
            } else {
                System.out.println("Ingrese la distancia recorrida en la maraton: ");
                double distanciaRecorrida = scanner.nextDouble();

                int tiempoTotal = convertidorMinutos(horasEmpleadas) + minutosEmpleadas;

                double tiempoMedioMinutosPorKm = tiempoTotal / distanciaRecorrida;

                System.out.println("El tiempo total gastado en la maraton es: " + tiempoTotal);
                System.out.println("Minutos por Km es:"+ tiempoMedioMinutosPorKm);
            }
        }
    }
    public static int convertidorMinutos(int horas){
        return horas * 60;
    }
}
