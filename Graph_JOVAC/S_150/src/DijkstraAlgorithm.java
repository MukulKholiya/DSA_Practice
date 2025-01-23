import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    class Pair{
        int vertex;
        String path;
        int cost;

        public Pair(int vertex, String path, int cost) {
            this.vertex = vertex;
            this.path = path;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "vertex=" + vertex +
                    ", path='" + path + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
    HashMap<Integer, HashMap<Integer,Integer>> map;
    public DijkstraAlgorithm(int v){
        map = new HashMap<>();
        for (int i = 1; i <= v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void Dijkastra(int src){
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((o1, o2) -> o1.cost-o2.cost);
        pq.add(new Pair(src,""+src,0));
        while(!pq.isEmpty()){
//            1. remove
            Pair p = pq.poll();
//            2. Ignore
            if(visited.contains(p.vertex)) {
                continue;
            }
//            3. marked visited
            visited.add(p.vertex);
//            4. Self work
            System.out.println(p);

//            5. Add unvisited nbrs
            for(int nbrs:map.get(p.vertex).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(p.vertex).get(nbrs);
                    pq.add(new Pair(nbrs,p.path+nbrs,p.cost+cost));
                }
            }
        }
    }
}
