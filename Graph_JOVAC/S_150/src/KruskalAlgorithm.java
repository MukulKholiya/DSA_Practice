import java.util.*;

public class KruskalAlgorithm {
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
    HashMap<Integer, HashMap<Integer,Integer>> map;
    public KruskalAlgorithm(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public List<EdgePair> getAllEdges(){
        List<EdgePair> ll = new ArrayList<>();
        for (int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
            }
        }
        return ll;
    }
    public void Kruskal(){
        // write down all edge pair
        List<EdgePair> ll = getAllEdges();
        ll.sort((o1, o2) -> o1.cost - o2.cost);
        DSU dsu = new DSU();
        for(int v : map.keySet()){
            dsu.create(v);
        }
        for(EdgePair ep: ll){
            int re1 = dsu.find(ep.edge1);
            int re2 = dsu.find(ep.edge2);
            if(re1!=re2){
                dsu.union(re1,re2);
            }
            // if we want to detect cycle we can add condition for re1==re2 and increment counter by 1
        }
    }


}
