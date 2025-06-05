package E3Egg;

import java.util.Scanner;

/*
Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
pantalla el área y perímetro del mismo
*/
public class AreaPerimetro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de áreas y perímetros de rectángulos");

        int base;
        int altura;
        do {
            System.out.println("Ingrese la base: ");
            base = scanner.nextInt();
            System.out.println("Ingrese la altura: ");
            altura = scanner.nextInt();
            if (base < 0 || altura < 0) {
                System.out.println("El numero no puede ser negativo");
            }
        }while (base < 0 || altura < 0);

        areaPerimetro(base, altura);

    }

    public static void areaPerimetro(double base, double altura) {

        double perimetro = 2 * altura + 2 * base;
        double area = altura * base;
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro es: " + perimetro);
    }

}
