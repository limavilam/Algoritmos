package ExeAlgoritmosYTOrdenamiento;

import java.util.Arrays;

public class OrdenamientoInsertDescendente {

    public static void main(String[] args) {

        int[] listadescendente = {25,4,12,3,32,29,60};
        int n = listadescendente.length;

        for (int i = 0; i < n; i++) {
            int index =  listadescendente[i];
            int j = i-1;
            while (j >= 0 && listadescendente[j] < index){
                listadescendente[j+1] = listadescendente[j];
                j = j-1;
            }
            listadescendente[j+1] = index;
        }
        System.out.println(Arrays.toString(listadescendente));
    }
}
