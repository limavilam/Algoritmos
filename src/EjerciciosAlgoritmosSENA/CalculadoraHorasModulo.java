package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class CalculadoraHorasModulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hora = 0;
        int minuto = 0;
        int segundo = 0;

        System.out.println("Ingrese la hora:");
        hora = input.nextInt();
        System.out.println("Ingrese los minutos: ");
        minuto = input.nextInt();
        System.out.println("Ingrese los segundos: ");
        segundo = input.nextInt();

        if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
            int siguienteSegundo = (segundo + 1) % 60;
            int siguienteMinuto = minuto;
            int siguienteHora = hora;

            if (siguienteSegundo == 0) {
                siguienteMinuto = (minuto + 1) % 60;
            }
            if (siguienteMinuto == 0) {
                siguienteHora = (hora + 1) % 24;
            }
            System.out.println("La hora en el siguiente segundo es: " + siguienteHora + "H:" + siguienteMinuto + "M:" + siguienteSegundo + "S");

        } else {
            System.out.println("La fecha no es valida, el formato debe ser HH <= 23, MM <=59, SS <=59");
        }
    }
}