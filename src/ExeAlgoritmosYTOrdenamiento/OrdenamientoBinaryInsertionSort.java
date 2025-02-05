package ExeAlgoritmosYTOrdenamiento;

import java.util.Arrays;

public class OrdenamientoBinaryInsertionSort {
    public static void main(String[] args) {

            int[] lista = {25, 4, 12, 3, 32, 29, 60};
            binaryInsertionSort(lista);
            System.out.println(Arrays.toString(lista));
    }

    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;

            for (int i = 1; i < n; i++) {
                int key = arr[i];

                // Refinamos la posición usando búsqueda binaria
                int left = 0, right = i - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (arr[mid] > key) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                // Mover elementos para hacer espacio
                for (int j = i - 1; j >= left; j--) {
                    arr[j + 1] = arr[j];
                }

                // Insertar en la posición encontrada
                arr[left] = key;
            }
       }
   }
