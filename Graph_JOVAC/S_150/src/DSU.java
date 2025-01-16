import java.util.HashMap;

public class DSU {
    class Node{
        int vertex;
        int rank;
        Node parent;

    }
    private HashMap<Integer,Node> map = new HashMap<>();
    public void create(int v){
        Node nn = new Node();
        nn.vertex = v;
        nn.parent = nn;
        nn.rank = 0;
        map.put(v,nn);
    }
    public int find(int v){
        Node nn = map.get(v);
        return find(nn).vertex;
    }
    private Node find(Node nn){
        if(nn.parent==nn){
            return nn;
        }
        Node n = find(nn.parent);
        nn.parent = n; // path compression; after some operation tc -> O(1)
        return n;
    }
    public void union(int v1,int v2){
        Node n1 = map.get(v1);
        Node n2 = map.get(v2);
        Node rn1 = find(n1);// Node n1 ka representative node
        Node rn2 = find(n2);// Node n1 ka representative node
        //union by rank
        if(rn1.rank==rn2.rank){
            rn1.parent = rn2;
            rn2.rank+=1;
        } else if (rn1.rank>rn2.rank) {
            rn2.parent = rn1;
        }else{
            rn1.parent = rn2;
        }
    }
}
