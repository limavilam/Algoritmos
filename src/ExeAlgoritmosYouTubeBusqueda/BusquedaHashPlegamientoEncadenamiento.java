package ExeAlgoritmosYouTubeBusqueda;

import java.util.LinkedList;

public class BusquedaHashPlegamientoEncadenamiento {
    public static void main(String[] args) {
        int[] cuentas = {303223421, 303112344, 304573193, 302130121, 403204568, 303211111}; // Ejemplo con colisión
        LinkedList<Integer>[] tablaHash = new LinkedList[10];

        // Inicializar la tabla hash con listas vacías
        for (int i = 0; i < tablaHash.length; i++) {
            tablaHash[i] = new LinkedList<>();
        }

        for (int cuenta : cuentas) {
            int hash = funcionHashPlegamiento(cuenta);
            tablaHash[hash].add(cuenta); // Agregar la cuenta a la lista en el índice hash
            System.out.println("Cuenta: " + cuenta + " -> Hash: " + hash);
        }

        // Imprimir la tabla hash con las cadenas
        System.out.println("\nTabla Hash con Encadenamiento:");
        for (int i = 0; i < tablaHash.length; i++) {
            System.out.print("Índice " + i + ": ");
            if (tablaHash[i].isEmpty()) {
                System.out.println("Vacío");
            } else {
                for (int cuenta : tablaHash[i]) {
                    System.out.print(cuenta + " -> ");
                }
                System.out.println();
            }
        }
    }

    public static int funcionHashPlegamiento(int cuenta) {
        String cuentaStr = String.valueOf(cuenta);
        int suma = 0;

        // Plegamiento de 4 dígitos
        for (int i = 0; i < cuentaStr.length(); i += 4) {
            int grupo = Integer.parseInt(cuentaStr.substring(i, Math.min(i + 4, cuentaStr.length())));
            suma += grupo;
        }

        return suma % 10; // Tamaño de la tabla hash es 10
    }
}
