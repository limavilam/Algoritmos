package ExeAlgoritmosYouTubeBusqueda;

/*
Función hash más común es la de operación módulo, donde h(k) = k mod N
Donde:
k es la clave
N es el tamaño de la tabla hash

 */
public class BusquedaHashModulo {
    public static void main(String[] args) {

        int [] claves = {25,40,15,30,50};
        int tamanoTabla = 7;

        /*
        25 % 7 = 4 (7x3 = 21) --> 25-21= 4

         */

        for (int clave : claves) {
            int hash = clave % tamanoTabla;
            System.out.println("Clave:" + clave + " --> hash: " + hash);
        }
    }
}
