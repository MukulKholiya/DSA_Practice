import java.util.Arrays;

public class disjoint {
    public static Integer[] parent;
    public static Integer[] rank;

    public  static void initialize(int n){
        parent = new Integer[n+1];
        rank = new Integer[n+1];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
    2f

    public static int findParent(int n){
        if(parent[n] == n) return n;
        return parent[n] = findParent(parent[n]);// path compression.
    }
    public static void main(String[] args) {
        initialize(5);
        union(1,2);
        union(3,4);
        union(2,5);
        System.out.println(Arrays.toString(parent));
    }

}
