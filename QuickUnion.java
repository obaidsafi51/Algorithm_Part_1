import edu.princeton.cs.algs4.StdOut;

public class QuickUnion {
    private final int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }// end of for
    }// end of quickUnion

    public int root(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }// end of root

    public void connected(int p, int q) { // Tells whether the nodes are connected or not
        if(root(p) == root(q)) StdOut.print("Connected");
        else StdOut.print("Not Connected");
    }// end of connected

    public void union(int p, int q ){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }// end of union

    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(100000);
       qu.union(0,1000);
        qu.connected(1,1000);
    }// end of main
}// end of quickunion


