package EjerciciosAlgoritmosYouTube;

public class BusquedaBinariaEx5_ArregloRotado {
    public static void main(String[] args) {
        //Buscar un elemento en un arreglo ordenado que ha sido rotado

        int [] rotatedArray = {4,5,6,7,0,1,2};
        int objetivo = 7;

        int resultado = buscarEnArregloRotado(rotatedArray,objetivo);

        if (resultado != -1){
            System.out.println("El número: " + objetivo + " se encuentra en el arreglo en la posición: " + resultado);
        } else{
            System.out.println("No se encuentra en el arreglo");
        }
    }

    public static int buscarEnArregloRotado(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // Mitad izquierda está ordenada
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Mitad derecha está ordenada
            else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}