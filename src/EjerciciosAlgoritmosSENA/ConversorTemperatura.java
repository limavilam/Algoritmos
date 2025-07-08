package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Convertidor de celsius a Fahrenheit!");

        while (true) {
            System.out.println("Ingrese la temperatura en celsius que desea convertir: ");
            double celsius = scanner.nextDouble();
            double temperaturaFahrenheit = convertirTemperatura(celsius);
            System.out.println("La temperatura en grados Fahrenheit: " + temperaturaFahrenheit);

            System.out.println("¿Desea convertir otra temperatura? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equals("n")) {
                break;
            }
        }
    }

    public static double convertirTemperatura(double temperatura) {
        /*
        Fahrenheit: (°C * 9/5) + 32
         */
        return temperatura * 1.8 + 32;
    }
}
