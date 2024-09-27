import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }// END OF FOR
    }// END OF QUICK FIND UF

    public  void connected(int p, int q){
       if (id[p] == id[q]) StdOut.print("Connected");
       else StdOut.print("Not Connected");
    }
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0 ; i < id.length ; i++){
            if(id[i] == pid) id[i] = qid;
        }
    }

    public static void main(String[] args) {
        QuickFindUF uf = new QuickFindUF(100000000);
        uf.union(0, 1);
        uf.union(1, 2);
        uf.union(2, 3);

        uf.connected(0, 2);
    }
}
