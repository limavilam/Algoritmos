package sena.ejercicios.guia3;

//Desarrollar un programa que permita calcular el área o perímetro de algunas figuras planas (círculo, triangulo, rectangulo, cuadrado)

import java.util.Scanner;

public class AreaPerimetroFigurasPlanas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de áreas y perímetros de figuras planas");

        while (true) {
            System.out.println("""
                    Por favor ingrese una opción del programa:
                    1. Calcular el área de figuras planas
                    2. Calcular el perímetro de figuras planas
                    3. Salir""");

            int opcionPrograma = scanner.nextInt();

            if (opcionPrograma == 1) {
                System.out.println("""
                        Por favor seleccione la figura plana:
                        1. Cuadrado
                        2. Rectángulo
                        3. Círculo
                        4. Triángulo
                        5. Volver al menú principal""");

                int opcionFiguraPlana = scanner.nextInt();
                switch (opcionFiguraPlana) {
                    case 1:
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        System.out.println("El área del cuadrado es: " + (ladoCuadrado * ladoCuadrado));
                        break;
                    case 2:
                        System.out.print("Ingrese la base del rectángulo: ");
                        double baseRect = scanner.nextDouble();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double alturaRect = scanner.nextDouble();
                        System.out.println("El área del rectángulo es: " + (baseRect * alturaRect));
                        break;
                    case 3:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        System.out.println("El área del círculo es: " + (Math.PI * radio * radio));
                        break;
                    case 4:
                        System.out.print("Ingrese la base del triángulo: ");
                        double baseTri = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double alturaTri = scanner.nextDouble();
                        System.out.println("El área del triángulo es: " + (baseTri * alturaTri / 2));
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else if (opcionPrograma == 2) {
                System.out.println("""
                        Por favor seleccione la figura:
                        1. Cuadrado
                        2. Rectángulo
                        3. Círculo
                        4. Triángulo
                        5. Volver al menú principal""");

                int opcionFiguraPerimetro = scanner.nextInt();
                switch (opcionFiguraPerimetro) {
                    case 1:
                        System.out.print("Ingrese el lado del cuadrado: ");
                        double lado = scanner.nextDouble();
                        double perimetroCuadrado = 4 * lado;
                        System.out.println("El perímetro del cuadrado es: " + perimetroCuadrado);
                        break;
                    case 2:
                        System.out.print("Ingrese largo del rectangulo: ");
                        double largo = scanner.nextDouble();
                        System.out.print("Ingrese ancho del rectangulo: ");
                        double ancho = scanner.nextDouble();
                        double perimetroRectangulo = 2 * (largo + ancho);
                        System.out.println("El perímetro del rectangulo es: " + perimetroRectangulo );
                        break;
                    case 3:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radioCirculo = scanner.nextDouble();
                        double perimetroCirculo = 2 * (Math.PI * radioCirculo);
                        System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer lado del triangulo: ");
                        double ladoUnoTriangulo = scanner.nextDouble();
                        System.out.println("Ingrese el segundo lado del triangulo: ");
                        double ladoDosTriangulo = scanner.nextDouble();
                        System.out.println("Ingrese el tercer lado del triangulo: ");
                        double ladoTresTriangulo = scanner.nextDouble();
                        double perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + ladoTresTriangulo;
                        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else if (opcionPrograma == 3) {
                System.out.println("Gracias por usar el programa ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}

