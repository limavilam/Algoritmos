package EjerciciosAlgoritmosSENA;
//Diseñar un algoritmo que permita ingresar la hora, minutos y segundos, y que calcule la hora en el siguiente
//segundo ("0<= H <=23", "0<= M <=59" "0<= S<=59").

import java.util.Scanner;

public class CalculadoraHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al reloj!");

        System.out.println("Ingrese las horas (formato 24 h):");
        int hora = scanner.nextInt();
        System.out.println("Ingrese las minutos (formato 59 minutos):");
        int minuto = scanner.nextInt();
        System.out.println("Ingrese las segundos (formato 59 segundos):");
        int segundo = scanner.nextInt();


        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59){
            System.out.println("Ingrese un numero valido");
        } else {

            segundo++;

            if (segundo == 60){
                segundo = 0;
                minuto = minuto + 1;
            }
            if (minuto == 60){
                minuto = 0;
                hora = hora + 1;
            }
            if(hora == 24){
                hora = 0;
            }
        }
        System.out.println("El hora es " + hora + " minutos " + minuto + " segundos "+ segundo);

    }
}
