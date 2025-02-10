package ExeAlgoritmosYTOrdenamiento;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] selectionSort = {40,13,28,7,32,15,24};
        int length = selectionSort.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (selectionSort[j] < selectionSort[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = selectionSort[i];
            selectionSort[i] = selectionSort[minIndex];
            selectionSort[minIndex] = temp;
            //System.out.println(Arrays.toString(selectionSort)); Imprime cada organización del arreglo

        }
        System.out.println("El arreglo es: " +Arrays.toString(selectionSort));


    }

}
