package ExeAlgoritmosYTBusqueda;

public class BusquedaHashPlegamiento {
    public static void main(String[] args) {
        int[] cuentas = {303223421, 303112344, 304573193, 302130121, 403204568};
        int[] tablaHash = new int[10];

        for (int cuenta : cuentas) {
            int hash = funcionHashPlegamiento(cuenta);
            tablaHash[hash] = cuenta;
            System.out.println("Cuenta: " + cuenta + " -> Hash: " + hash);
        }

        // Imprimir la tabla hash resultante (opcional)
        System.out.println("\nTabla Hash:");
        for (int i = 0; i < tablaHash.length; i++) {
            System.out.println("Índice " + i + ": " + tablaHash[i]);
        }
    }

    public static int funcionHashPlegamiento(int cuenta) {
        String cuentaStr = String.valueOf(cuenta);
        int suma = 0;

        // Plegamiento de 4 dígitos
        for (int i = 0; i < cuentaStr.length(); i += 4) {
            int grupo = Integer.parseInt(cuentaStr.substring(i, Math.min(i + 4, cuentaStr.length())));
            suma += grupo;
            System.out.println("la suma: " + suma);
        }

        return suma % 10; // Tamaño de la tabla hash es 10
    }
}
