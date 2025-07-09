package EjerciciosAlgoritmosSENA;

import java.util.Scanner;

public class PalindromoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número que quiere verificar si es palíndromo:");
        int numero = scanner.nextInt();
        int numeroOrginal = numero;

        int numerofinal= 0;

        while (numero != 0) {
            int digito = numero % 10;
            System.out.println(digito);
            //iteración 1 = número final es 0
            //iteracion 2 = número final + digito
            numerofinal = numerofinal * 10 + digito;
            System.out.println("El número final es:" + numerofinal);
            numero = numero / 10;
        }

        if (numeroOrginal == numerofinal) {
            System.out.println("El número ingresado: " + numeroOrginal + "es palíndromo");
        }else{
            System.out.println("El número ingresado no es palíndromo");
        }




    }
}
