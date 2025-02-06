package ExeAlgoritmosYTOrdenamiento;

import java.util.Arrays;

public class InsertionSortExe1Descendete {
    /*
    Dado el arreglo desordenado, ordenarlo de menor a mayor.
     */
    public static void main(String[] args) {

        int [] arr = {7,3,5,1,9,2};
        int n = arr.length;

        System.out.println("El arreglo original es: "+Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            int j = i-1;
            int index = arr[i];
            while (j >= 0 && arr[j] < index) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = index;
        }
        System.out.println("El arreglo ordenado es: " + Arrays.toString(arr));

    }
}
