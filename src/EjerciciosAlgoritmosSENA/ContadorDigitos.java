package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int contadorDigitos = 0;
        double sumar = 0;

        while (numero != 0){
            int digito = numero % 10;
            System.out.println("El digito es: " + digito);
            sumar = sumar + digito;
            numero = numero / 10;
            contadorDigitos = contadorDigitos + 1;
            System.out.println("Los números digitados son: " + numero);

        }
        System.out.println("La cantidad de números del número ingresado es:" + contadorDigitos);
        System.out.println("La suma de los digitos es:" + sumar);
    }
}
