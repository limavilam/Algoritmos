package EjerciciosAlgoritmosYouTube;

public class BusquedaBinariaEx4_NumbMax {
    //Búsqueda del primer numero mayor o igual al objetivo
    public static void main(String[] args) {
        int [] numeros = {3,5,8,10,15,20,25,30};
        int objetivo = 18;

        int maxNumber = busquedaMax (numeros,objetivo);

        if (maxNumber != -1){
            System.out.println("El primer número mayor o igual a " + objetivo + " es: " + maxNumber);
        } else {
            System.out.println("No hay ningún número mayor o igual a " + objetivo + " en el arreglo.");
        }

    }

    public static int busquedaMax(int[] numero, int objetivo) {
        int inicio = 0;
        int fim = numero.length - 1;
        int resultado = -1; //Para almacenar el primer número mayor o igual al objetivo.

        while (inicio <= fim) {
            int middle = (inicio + fim)/2;
            if (numero[middle] >= objetivo) {
                resultado = numero[middle];
                /*
                Si dejo inicio = middle +1
                Cuando encuentras un número que es mayor o igual al objetivo,
                estás moviendo inicio hacia la derecha (middle + 1), lo cual significa
                que ignoras por completo la posibilidad de que haya un número más pequeño
                (pero aún mayor o igual al objetivo) en la mitad izquierda del array.
                 */
                fim = middle - 1; //
            } else {
                inicio = middle + 1;
            }
        }



        return resultado;
    }

}
