import java.util.*;
import java.util.Collections;
import java.util.Comparator;
class Edge implements Comparable<Edge>{
    int src;
    int des;
    int weight;
    public Edge(int s,int d,int w){
        this.src=s;
        this.des=d;
        this.weight=w;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}
public class weightedGraphs extends disjoint {

    public static void main(String[] args) {
        ArrayList<Edge> edge = new ArrayList<>();
        edge.add(new Edge(0,3,2));
        edge.add(new Edge(0,2,1));
        edge.add(new Edge(1,3,1));
        edge.add(new Edge(3,4,4));
        edge.add(new Edge(3,5,1));
        edge.add(new Edge(2,5,4));
        edge.add(new Edge(1,2,2));
        edge.add(new Edge(4,5,3));
        System.out.println(kruskal_MST(edge,5));

    }
    public static int kruskal_MST(ArrayList<Edge> edges, int V){
        Collections.sort(edges);
//        System.out.println(edges);
        initialize(V);
        int res = 0;
        for (Edge e : edges){
            int  u = e.src;
            int v = e.des;
            int w = e.weight;
            int x  = findParent(u);
            int y = findParent(v);
            if(x!=y){
                union(x,y);
                res+=w;
            }
        }
        return res;

    }
}
