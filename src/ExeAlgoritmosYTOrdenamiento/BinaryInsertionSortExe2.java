package ExeAlgoritmosYTOrdenamiento;

public class BinaryInsertionSortExe2 {
    public static void main(String[] args) {
        int[] array = {18, 7, 12, 5, 9, 3};

        binaryInsertionSort(array);

        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Función para realizar la búsqueda binaria
    public static int binarySearch(int[] array, int key, int inicio, int fin) {
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (key == array[medio]) {
                return medio + 1;
            }
            if (key > array[medio]) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return inicio;
    }

    public static void binaryInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Encuentra el índice correcto usando búsqueda binaria
            int pos = binarySearch(array, key, 0, j);

            // Mueve todos los elementos mayores que 'key' una posición a la derecha
            while (j >= pos) {
                array[j + 1] = array[j];
                j--;
            }

            // Coloca 'key' en su lugar adecuado
            array[j + 1] = key;
        }
    }
}
