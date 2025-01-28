package EjerciciosAlgoritmosYouTube;

public class BusquedaBinariaEx1 {
    public static void main(String[] args) {
        /*
        Divide y venceras: Compara el elemento central con el valor buscado.
        Si es menor, descarta la mitad izquierda.
        Si es mayor, descarta la mitad derecha.
        Repite hasta encontrar el valor o hasta que no queden elementos por buscar.
         */
        int[] contenedor = {10,20,30,40,50,60,70,80};
        int objetivo = 50;

        //Se llama al metodo de busqueda binaria.
        int resultado = busquedaBinaria(contenedor,objetivo);

        //Mostrar el resultado
        if(resultado != objetivo){
            System.out.println("El elemento encontrado está en la posición: " + resultado);
        }else{
            System.out.println("Elemento no encontrado");
        }
    }

    public static int busquedaBinaria(int[] array, int objetivo){
        int inicio = 0; //Indice inicial
        int fin = array.length-1; //Indice final
        while(inicio <= fin){

            /*Inicio = 0 (índice 0, valor 10),
            Fin = 7 (índice 7, valor 80).

            Iteración 1: medio (0+7)/2=3.5 = 3
            Valor medio = 40
            inicio = medio + 1 = 3+1 = 4

            Iteración 2: medio = 4+7/2=5.5=5
            valor medio = 60
            fin = medio - 1 --> 5-1 = 4

            Iteración 3: medio = 4+4/2 = 4
            valor medio = 50
            retorna el valor medio

             */

            int medio = (fin+inicio)/2;

            //Se compara es el valor del arreglo en la posición del array, ojo no va objetivo == medio, eso sería comparar valores
            if(objetivo == array[medio]){
                return medio;
            }else if(objetivo > array[medio]){
                inicio = medio + 1;
                System.out.println("La posición es: " + inicio);
            }else if (objetivo < array[medio]){
                fin = medio - 1;
                System.out.println("La posición f es: " + fin);
            }

        }
        return -1;
    }


}

