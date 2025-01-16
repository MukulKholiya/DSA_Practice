import java.util.*;

public class Validtree {
    public static void main(String[] args) {
       int[][] edges = {{0,1}, {0,2}, {0,3}, {1,4}};
        int n = 5;
        System.out.println(validTree(n,edges));
    }
    public static boolean validTree(int n,int[][] edges){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            map.put(i,new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return BFT(map);
    }
    public static boolean BFT(HashMap<Integer,List<Integer>> map){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int c = 0;
        for(int src : map.keySet()) {
            if(visited.contains(src)){
                return false;
            }
            c++;
            q.add(src);
            while (!q.isEmpty()) {
                int rv = q.poll();
                if (visited.contains(rv)) {
                    continue;
                }
                visited.add(rv);
                System.out.println(rv + " ");
                for (int nbrs : map.get(rv)) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return c ==1;

    }
}


