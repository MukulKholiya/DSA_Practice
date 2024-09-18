import java.util.*;
public class dijkstra {
     static class Pair implements Comparable<Pair>{
        int node;
        int distance;
        public Pair(int n , int m){
//            super();
            node = n;
            distance = m;
        }

        @Override
        public int compareTo(Pair o) {
            return this.distance-o.distance;
        }
    }
    public static void main(String[] args) {

    }
    public static int[] dijk(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[S] = 0;
        pq.add(new Pair(S, dist[S]));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int curr_node = curr.node;
            int curr_dist = curr.distance;
            for(ArrayList<Integer> nbrs:adj.get(curr_node)){
                int nbr_node = nbrs.get(0);
                int nbr_wt = nbrs.get(1);
                if(dist[nbr_node] > curr_dist+nbr_wt){
                    dist[nbr_node] = curr_dist+nbr_wt;
                    pq.add(new Pair(nbr_node,dist[nbr_node]));
                }
            }
        }
        return dist;
    }
}
