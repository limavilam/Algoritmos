package ExeAlgoritmosYTBusqueda;

public class BusquedaBinariaEx3_Strings {

    public static void main(String[] args) {

        String[] frutas = {"apple", "banana", "orange", "pineapple", "strawberry", "cherry", "mango"};
        String frutaBusqueda = "pineapple";

        int resultado = busquedaBinaria(frutas, frutaBusqueda);

        if (resultado == -1) {
            System.out.println("No se encontro el resultado");
        } else {
            System.out.println("El resultado es: " + resultado);
        }
    }

    public static int busquedaBinaria(String[] frutas, String frutaBusqueda) {
        int inicio = 0;
        int fim = frutas.length;
        while (inicio <=fim){
            int middle = (inicio + fim) / 2;
            if (frutaBusqueda.equals(frutas[middle])){
                return middle;
            } else if (frutaBusqueda.compareTo(frutas[middle]) > 0) {
                inicio = middle + 1;
            } else if(frutaBusqueda.compareTo(frutas[middle]) < 0){
                fim = middle - 1;
            }
        }

        return -1;


    }
}

