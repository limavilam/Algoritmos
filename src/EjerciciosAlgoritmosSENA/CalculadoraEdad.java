package EjerciciosAlgoritmosSENA;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        System.out.println("Bienvenido a la calculadora de edades!");

        while (true) {
            System.out.println("Ingrese su fecha de nacimiento (AAAA-MM-DD):");
            String fechaNacimientoStr = scanner.nextLine();

            try {

                LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

                if (fechaNacimiento.isAfter(fechaActual)) {
                    System.out.println("¡Error! La fecha de nacimiento no puede ser en el futuro. Intente de nuevo.");
                    continue;
                }

                Period periodo = Period.between(fechaNacimiento, fechaActual);
                //System.out.println(periodo);

                int edad = periodo.getYears();
                int mes = periodo.getMonths();
                int dias = periodo.getDays();

                System.out.println("Tienes " + edad + " años.");
                System.out.println("meses: " + mes);
                System.out.println("Dias: " + dias);

            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en formato AAAA-MM-DD.");
            }
        }
    }
}
