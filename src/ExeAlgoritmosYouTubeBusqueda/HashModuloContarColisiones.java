package ExeAlgoritmosYouTubeBusqueda;

import java.util.Arrays;

public class HashModuloContarColisiones {
    public static void main(String[] args) {

        int[] claves = {25, 40, 15, 30, 50};
        int tamanoTabla = 7;

        int[] tablaHash = new int[tamanoTabla]; // Tabla de dispersión inicializada en 0
        Arrays.fill(tablaHash, -1); // Usamos -1 para indicar espacios vacíos

        int colisiones = 0;

        for (int clave : claves) {
            int hash = clave % tamanoTabla;

            // Si la posición ya está ocupada, hay colisión
            if (tablaHash[hash] != -1) {
                colisiones++;
                System.out.println("Colisión detectada para clave " + clave + " en la posición " + hash);
            }

            // Insertamos la clave en la tabla hash
            tablaHash[hash] = clave;

            System.out.println("Clave: " + clave + " --> Hash: " + hash);
        }

        System.out.println("Número total de colisiones: " + colisiones);
        System.out.println("Estado final de la tabla hash: " + Arrays.toString(tablaHash));
    }

}
