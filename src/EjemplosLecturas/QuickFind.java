package EjemplosLecturas;

public class QuickFind {
    private int[] id;

    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }
    public boolean union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
        return false; //Si quiero que imprima el boolean pero podría ser el retorno de void
    }

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(5);
        qf.connected(0, 1);
        qf.union(0, 1);
        qf.union(1, 2);
        //qf.union(2, 3);
        System.out.println(qf.connected(0, 2));
        System.out.println(qf.union(2,3));
    }
}
