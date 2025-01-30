package ExeAlgoritmosYouTubeBusqueda;

/*
H(K) = digitosCentrales(K2)
 */

public class BúsquedaHashCuadrado {
    public static void main(String[] args) {

        int[] claves = {25, 40, 15, 30, 50};
        int tamanoTabla = 7;

        for (int clave : claves) {
            int hash = hashCuadrado(clave, tamanoTabla);
            System.out.println("Clave: " + clave + " -> Hash: " + hash);

        }
    }

    public static int hashCuadrado(int clave, int tamanoTabla) {
        int cuadrado = clave * clave;
        String cuadradoString = String.valueOf(cuadrado); //Convierte el cuadrado a una cadena de texto

        int mitad = cuadradoString.length()/2; //Calcula el índice del caracter central de la cadena

        /*
        En Java, substring es un metodo de la clase String que se utiliza para extraer una parte de una cadena (string)
        y crear una nueva cadena con esa porción. En esencia, te permite obtener una "subcadena" de una cadena original.
         */

        /*

        int cuadradoMitad = Integer.parseInt(cuadradoString.substring(mitad-1, mitad+1));
        //Convierte substring en un número entero
        int hash = Integer.parseInt(String.valueOf(cuadradoMitad));

         */

        int hash = Integer.parseInt(cuadradoString.substring(mitad-1, mitad+1)); //índice que se extrae pero sin incluirlo, sería 12*12=144

        //mitad = (144) 3 /2 = 1
        //mitad + 1 = 2 ---> (índice del cual se extrae pero SIN incluirlo): 4
        //mitad -1 = 0  ---> Valor 1 del índice 0
        // 14 % 10 = 4
        return hash % tamanoTabla;
    }
}
