package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el capital inicial:");
        double capital = scanner.nextDouble();

        System.out.println("Ingrese la tasa de interés anual en porcentaje (ej. 5 para 5%):");
        double tasaPorcentaje = scanner.nextDouble();

        if (capital <= 0 || tasaPorcentaje <= 0) {
            System.out.println("El capital y la tasa deben ser mayores que cero.");
        } else {
            double tasa = tasaPorcentaje / 100;
            double monto = capital;
            int anios = 0;

            while (monto < 2 * capital) {
                monto *= (1 + tasa);
                anios++;
            }

            System.out.println("El capital se duplicará en " + anios + " años.");
        }
    }
}
