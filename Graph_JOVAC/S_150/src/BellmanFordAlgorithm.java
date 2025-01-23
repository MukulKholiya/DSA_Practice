import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFordAlgorithm {
    static class EdgePair{
        int edge1;
        int edge2;
        int cost;

        public EdgePair(int edge1, int edge2, int cost) {
            this.edge1 = edge1;
            this.edge2 = edge2;
            this.cost = cost;
        }

    }
    public List<BellmanFordAlgorithm.EdgePair> getAllEdges(){
        List<BellmanFordAlgorithm.EdgePair> ll = new ArrayList<>();
        for (int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }
    HashMap<Integer, HashMap<Integer,Integer>> map;
    public BellmanFordAlgorithm(int v){
        map = new HashMap<>();
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
    }
    public void BellmanFord(){
        List<EdgePair> ll = getAllEdges();
        int v = map.size();
        int[] dis = new int[v+1];
        for(int i = 2 ; i<dis.length ; i++){
            dis[i] = 9897612;
        }
        for (int i = 1; i <= v ; i++) {
            for(EdgePair e : ll){
                if(i == v && dis[e.edge2]> dis[e.edge1] + e.cost){
                    System.out.println("Negative cycle is present");;
                }
                if(dis[e.edge2]> dis[e.edge1] + e.cost){
                    dis[e.edge2] = dis[e.edge1] + e.cost;
                }
            }
        }
        for (int i = 1; i < dis.length ; i++) {
            System.out.println(dis[i] + " ");
        }

    }

    public static void main(String[] args) {
        BellmanFordAlgorithm g = new BellmanFordAlgorithm(7);
        g.addEdge(1,2,2);
        g.addEdge(2,3,2);
        g.addEdge(3,4,2);
        g.addEdge(1,4,2);
        g.addEdge(2,5,2);
        g.addEdge(5,6,2);
        g.addEdge(6,7,2);
        
    }


}
