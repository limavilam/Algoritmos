package EjerciciosAlgoritmosSENA;

//Palabra que se lee igual al derecho y al reves

import java.util.Scanner;

public class PalindromoPalabras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la palabra que quiere verificar si es palindromo:\n");
        String palabra = scanner.nextLine();
        int tamanoPalabra = palabra.length();
        System.out.println(tamanoPalabra);

        boolean esPalindromo = true;

        for (int i = 0; i < palabra.length()/2; i++) {
            //System.out.println("La letra de la posición inicial " + i + " es: " + palabra.charAt(i));
            //System.out.println("La letra de la posición final es: " + (palabra.charAt(palabra.length()-i-1)));
            //System.out.println("La letra de la posición final es: " + (palabra.length()-i-1));
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-i-1)) {
                esPalindromo = false;
            }
        }
        if (esPalindromo) {
            System.out.println("La palabra '" + palabra + "' SÍ es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO es un palíndromo.");
        }
    }
}
