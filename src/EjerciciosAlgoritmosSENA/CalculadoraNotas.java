package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estimado maestro ingrese las notas de su estudiante:");

        int cantidadNotas = 3;

        System.out.println("Nota taller 1: ");
        double notaTaller1 = scanner.nextDouble();
        System.out.println("Nota taller 2: ");
        double notaTaller2 = scanner.nextDouble();
        System.out.println("Nota quiz: ");
        double notaQuiz = scanner.nextDouble();
        System.out.println("Nota parcial: ");
        double notaParcial = scanner.nextDouble();

        if(notaTaller1 < 0 || notaTaller2 < 0 || notaQuiz < 0 || notaParcial < 0) {
            System.out.println("Ingrese un numero valido");
        }else{
            double promedioNotas = (notaTaller1 + notaTaller2 + notaQuiz)/cantidadNotas;
            double calculoPorcentaje = promedioNotas * 0.30;
            double calculoParcial = notaParcial * 0.70;
            double notaFinal = calculoParcial + calculoPorcentaje;

            System.out.println("El promedio de notas es: " + promedioNotas);
            System.out.println("El 30 % de la nota es: " + calculoPorcentaje);
            System.out.println("El 70 % de la nota es: " + calculoParcial);
            System.out.println("La nota final es: " + notaFinal);
        }

    }
}
