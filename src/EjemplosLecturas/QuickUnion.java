package EjemplosLecturas;

public class QuickUnion {
    private int[] id;

    // Constructor: Inicializa el array id[]
    public QuickUnion(int[] initialArray) {
        id = initialArray.clone(); // Copia el array inicial
    }

    // Metodo para encontrar la raíz de un elemento
    private int root(int i) {
        while (i != id[i]) { // Sigue las referencias hasta encontrar la raíz
            i = id[i];
        }
        return i;
    }

    // Metodo union: Une dos elementos
    public void union(int p, int q) {
        int rootP = root(p); // Encuentra la raíz de p
        int rootQ = root(q); // Encuentra la raíz de q

        if (rootP != rootQ) { // Solo une si están en diferentes componentes
            id[rootP] = rootQ; // Conecta la raíz de p con la raíz de q
        }
    }

    // Metodo para imprimir el array id[]
    public void printIdArray() {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }

    // Metodo principal para probar el ejemplo
    public static void main(String[] args) {
        // Array inicial personalizado
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Crear la instancia de QuickUnion
        QuickUnion qu = new QuickUnion(initialArray);

        // Imprimir el estado inicial del array
        System.out.println("Estado inicial del array:");
        qu.printIdArray();

        // Realizar union(3, 4)
        qu.union(3, 4);
        System.out.println("Después de union(3, 4):");
        qu.printIdArray();

        // Realizar union(3, 8)
        qu.union(3, 8);
        System.out.println("Después de union(3, 8):");
        qu.printIdArray();
    }
}
