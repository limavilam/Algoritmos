package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class AreasVolumenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de áreas y volúmenes");

        while (true) {
            System.out.println("""
                    Por favor ingrese una opción del programa:
                    1. Calcular el área de figuras planas
                    2. Calcular el área y volumen de figuras tridimensionales
                    3. Calcular Volumen de Sólido Irregular (Método de Desplazamiento)
                    4. Salir""");

            int opcionPrograma = scanner.nextInt();

            if (opcionPrograma == 1) {
                System.out.println("""
                        Por favor seleccione la figura plana:
                        1. Cuadrado
                        2. Rectángulo
                        3. Círculo
                        4. Triángulo
                        5. Trapecio
                        6. Volver al menú principal""");

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
                        System.out.print("Ingrese la base mayor del trapecio: ");
                        double baseMayor = scanner.nextDouble();
                        System.out.print("Ingrese la base menor del trapecio: ");
                        double baseMenor = scanner.nextDouble();
                        System.out.print("Ingrese la altura del trapecio: ");
                        double alturaTrap = scanner.nextDouble();
                        System.out.println("El área del trapecio es: " + ((baseMayor + baseMenor) * alturaTrap / 2));
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else if (opcionPrograma == 2) {
                System.out.println("""
                        Por favor seleccione la figura tridimensional:
                        1. Cubo
                        2. Prisma rectangular
                        3. Esfera
                        4. Cilindro
                        5. Cono
                        6. Pirámide
                        7. Volver al menú principal""");

                int opcionFigura3D = scanner.nextInt();
                switch (opcionFigura3D) {
                    case 1:
                        System.out.print("Ingrese el lado del cubo: ");
                        double lado = scanner.nextDouble();
                        double areaCubo = 6 * lado * lado;
                        double volumenCubo = lado * lado * lado;
                        System.out.println("Área del cubo: " + areaCubo + ", Volumen: " + volumenCubo);
                        break;
                    case 2:
                        System.out.print("Ingrese largo: ");
                        double largo = scanner.nextDouble();
                        System.out.print("Ingrese ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingrese alto: ");
                        double alto = scanner.nextDouble();
                        double areaPrisma = 2 * (largo * ancho + largo * alto + ancho * alto);
                        double volumenPrisma = largo * ancho * alto;
                        System.out.println("Área del prisma: " + areaPrisma + ", Volumen: " + volumenPrisma);
                        break;
                    case 3:
                        System.out.print("Ingrese el radio de la esfera: ");
                        double radioEsfera = scanner.nextDouble();
                        double areaEsfera = 4 * Math.PI * Math.pow(radioEsfera, 2);
                        double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radioEsfera, 3);
                        System.out.println("Área de la esfera: " + areaEsfera + ", Volumen: " + volumenEsfera);
                        break;
                    case 4:
                        System.out.print("Ingrese el radio del cilindro: ");
                        double radioCil = scanner.nextDouble();
                        System.out.print("Ingrese la altura del cilindro: ");
                        double alturaCil = scanner.nextDouble();
                        double areaCil = 2 * Math.PI * radioCil * (radioCil + alturaCil);
                        double volumenCil = Math.PI * Math.pow(radioCil, 2) * alturaCil;
                        System.out.println("Área del cilindro: " + areaCil + ", Volumen: " + volumenCil);
                        break;
                    case 5:
                        System.out.print("Ingrese el radio del cono: ");
                        double radioCono = scanner.nextDouble();
                        System.out.print("Ingrese la altura del cono: ");
                        double alturaCono = scanner.nextDouble();
                        double generatriz = Math.sqrt(radioCono * radioCono + alturaCono * alturaCono);
                        double areaCono = Math.PI * radioCono * (radioCono + generatriz);
                        double volumenCono = (Math.PI * Math.pow(radioCono, 2) * alturaCono) / 3;
                        System.out.println("Área del cono: " + areaCono + ", Volumen: " + volumenCono);
                        break;
                    case 6:
                        System.out.print("Ingrese el área de la base de la pirámide: ");
                        double areaBase = scanner.nextDouble();
                        System.out.print("Ingrese la altura de la pirámide: ");
                        double alturaPiramide = scanner.nextDouble();
                        System.out.print("Ingrese el área lateral de la pirámide: ");
                        double areaLateral = scanner.nextDouble();
                        double areaPiramide = areaBase + areaLateral;
                        double volumenPiramide = (areaBase * alturaPiramide) / 3;
                        System.out.println("Área de la pirámide: " + areaPiramide + ", Volumen: " + volumenPiramide);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } else if (opcionPrograma == 3) {
                System.out.print("Ingrese el volumen inicial del agua (mL): ");
                double volumenInicial = scanner.nextDouble();
                System.out.print("Ingrese el volumen final del agua con el sólido (mL): ");
                double volumenFinal = scanner.nextDouble();
                double volumenSolido = volumenFinal - volumenInicial;
                System.out.println("El volumen del sólido irregular es: " + volumenSolido + " mL");
            } else if (opcionPrograma == 4) {
                System.out.println("Gracias por usar el programa ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
