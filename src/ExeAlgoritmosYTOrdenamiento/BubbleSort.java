package ExeAlgoritmosYTOrdenamiento;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] bubbleSortAlgoritmo = {28,45,10,24,3,60,32};
        int n = bubbleSortAlgoritmo.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bubbleSortAlgoritmo[j] > bubbleSortAlgoritmo[j + 1]) {
                    int aux = bubbleSortAlgoritmo[j];
                    bubbleSortAlgoritmo[j] = bubbleSortAlgoritmo[j + 1];
                    bubbleSortAlgoritmo[j + 1] = aux;
                }
            }
        }
        System.out.println("El arreglo es: " + Arrays.toString(bubbleSortAlgoritmo));
    }
}
