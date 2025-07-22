package sena.ejercicios.guia3;

//Desarrollar un programa que permita almacenar las edades de un grupo de 10 personas en un vector de
//enteros y luego determine la cantidad de personas que son menores de edad, mayores de edad, cuántos
//adultos mayores, la edad más baja, la edad más alta y el promedio de edades ingresadas. Para el ejercicio
//anterior suponga que un adulto mayor debe tener una edad igual o superior a 60. Debe validar para cada
//ingreso que los valores estén en un rango entre 1 y 120 años. En caso de error deberá notificar y solicitar
//un nuevo valor.

import java.util.Scanner;

public class AnalisisEdadesGrupo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al análisis de edades por grupo!");

        int[] arregloNumeros = new int[10];

        for (int i = 0; i < arregloNumeros.length; i++) {
            int numero;
            do{
                System.out.println("Ingrese el número " + i + ":");
                numero = scanner.nextInt();

                if(numero < 1 || numero > 120){
                    System.out.println("Ingrese un número entre 1 y 120");
                }else{
                    arregloNumeros[i] = numero;
                }

            }while(numero < 1 || numero > 120);
        }

        System.out.println("Menores de edad:" + menoresDeEdad(arregloNumeros));
        System.out.println("Mayores de edad:" + mayoresDeEdad(arregloNumeros));
        System.out.println("Adultos mayores: " + adultosMayores(arregloNumeros));

        int[] extremos = edadBajaEdadAlta(arregloNumeros);
        System.out.println("Edad más baja: " + extremos[0]);
        System.out.println("Edad más alta: " + extremos[1]);

        System.out.println("Promedio de edades: " + promedioEdades(arregloNumeros));
    }

    public static int menoresDeEdad(int[] arregloNum) {
        int menoresEdad = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            if (arregloNum[i] < 18) {
                menoresEdad++;
            }
        }
        return menoresEdad;
    }

    public static int mayoresDeEdad(int[] arregloNum) {
        int mayoresEdad = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            if (arregloNum[i] >= 18) {
                mayoresEdad++;
            }
        }
        return mayoresEdad;
    }

    public static int adultosMayores(int[] arregloNum) {
        int adultosMayores = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            if (arregloNum[i] >= 60) {
                adultosMayores++;
            }
        }
        return adultosMayores;
    }

    public static int[] edadBajaEdadAlta(int[] arregloNum) {
        int max = arregloNum[0];
        int min = arregloNum[0];
        for (int i = 1; i < arregloNum.length; i++) {
            if (arregloNum[i] < min) {
                min = arregloNum[i];
            }
            if (arregloNum[i] > max) {
                max = arregloNum[i];
            }
        }
        return new int[]{min, max};
    }

    public static double promedioEdades(int[] arregloNum) {
        int suma = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            suma += arregloNum[i];
        }
        return (double) suma/arregloNum.length;
    }
}

