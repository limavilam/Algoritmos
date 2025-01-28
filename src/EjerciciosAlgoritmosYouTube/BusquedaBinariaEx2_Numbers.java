package EjerciciosAlgoritmosYouTube;

public class BusquedaBinariaEx2_Numbers {
    //Búsqueda binaria de un número en un arreglo de enteros

    public static void main(String[] args) {

        int [] numeros = {5,12,17,23,38,45,59,62,78,90};
        int objetivo = 5 ;

        int resultado = busquedaBinaria(numeros,objetivo);

        if (resultado != objetivo) {
            System.out.println("El número es: " + objetivo + " y se encuentra en la posición: " + resultado);
        }else{
            System.out.println("El número no se encuentra en el arreglo");
        }
    }

    public static int busquedaBinaria(int [] numeros,int objetivo){
        int inicio = 0;
        int fin = numeros.length-1;
        while (inicio <= fin){
            int middle = (inicio+fin)/2;
            if (numeros[middle] == objetivo){
                return middle;
            } else if (objetivo > numeros[middle]){
                inicio = middle+1;
                System.out.println("La posición es " + inicio);
            } else if (objetivo < numeros[middle]) {
                fin = middle-1;
                System.out.println("La posición f es " + inicio);
            }
        }
        return inicio;

    }
}
