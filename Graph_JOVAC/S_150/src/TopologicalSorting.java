import java.util.*;

public class TopologicalSorting {
    private HashMap<Integer, List<Integer>> map = new HashMap<>();
    public TopologicalSorting(int v){
        for (int i = 0; i < v ; i++) {
            map.put(i,new ArrayList<>());
        }
    }
    public void addEdge(int v1,int v2){
        map.get(v1).add(v2);
    }
    public int[] indegree(){
        int[] in = new int[map.size()];
        for(int v1:map.keySet()){
            for(int v2:map.get(v1)){
                in[v2]++;
            }
        }
        return in;
    }
    public void TopologicalSorting(){
        int[] in = indegree();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if(in[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int r = q.poll();
            System.out.println(r+" ");
            for(int nbrs:map.get(r)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
    }

    public static void main(String[] args) {
        TopologicalSorting ts = new TopologicalSorting(8);
        ts.addEdge(1, 2);
        ts.addEdge(1, 0);
        ts.addEdge(1, 4);
        ts.addEdge(4, 3);
//        ts.addEdge(3, 2);
        ts.addEdge(4, 5);
        ts.addEdge(5, 7);
        ts.addEdge(6, 3);
        ts.addEdge(6, 7);
        ts.TopologicalSorting();

    }
}
