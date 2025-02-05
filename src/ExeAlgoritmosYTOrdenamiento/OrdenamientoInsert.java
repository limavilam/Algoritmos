package ExeAlgoritmosYTOrdenamiento;

import java.util.Arrays;

public class OrdenamientoInsert {

    public static void main(String[] args) {

        int[] lista ={25,4,12,3,32,29,60};
        int n = lista.length;

        for (int i = 0; i < n; i++) {
            int index = lista[i];
            int j = i-1;
            while (j >= 0 && lista[j] > index){
                lista[j+1] = lista[j];
                j=j-1;
            }
            lista[j+1] = index;
        }
        System.out.println(Arrays.toString(lista));
    }
}
