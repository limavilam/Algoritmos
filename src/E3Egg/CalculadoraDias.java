package E3Egg;

import java.util.Scanner;

/*
A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
1 día = 24 horas = 1440 minutos = 86400 segundos
*/
public class CalculadoraDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de días");

        int dias;
        do{
            System.out.println("Ingrese el número de días que desea calcular:");
            dias = scanner.nextInt();
            if(dias<0) {
                System.out.println("El numero no puede ser negativo");
            }
        }while(dias<0);

        calculadoraDias(dias);

    }

    public static void calculadoraDias(int dias) {
        int hora = 24;
        int minuto = 60;
        int segundo = 60;

        int horas = dias * hora;
        int minutos = horas * minuto;
        int segundos = segundo * minutos;

        System.out.println("Días ingresados:" + dias);
        System.out.println("Horas totales en los días ingresados:" + horas);
        System.out.println("Minutos totales en los días ingresados:" + minutos);
        System.out.println("Segundos totales en los días ingresados:" + segundos);
    }
}
