import java.util.*;
public class adjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[e][2];
        for (int i = 0; i < edges.length; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        int[][] graph = new int[n][n];
        adjacency(graph,n,edges);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<ArrayList<Integer>> newGraph = new ArrayList<>();


    }
    public static ArrayList<ArrayList<Integer>> createAdjList(int n, int e, ArrayList<ArrayList<Integer>> edges){
        ArrayList<ArrayList<Integer>> cl = new ArrayList<>();
        for(int i = 0;i<n;i++) cl.add(new ArrayList<>());
        for(int i = 0;i<edges.size();i++){
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            cl.get(u).add(v);
        }
        return cl;
    }
    public static void adjacency(int[][] graph , int n , int[][] edges){
        for (int i = 0; i < edges.length; i++) {
            int row = edges[i][0];
            int col = edges[i][1];
            graph[row][col] = 1;
            graph[col][row] = 1;
        }

    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph , int s, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        // add source to queue
        q.add(s);
        visited[s] = true;
        // traverse while q is not empty
        while (!q.isEmpty()){
            int cur = q.poll();
            System.out.println(cur);
            ArrayList<Integer> neighbr = graph.get(cur);
            for(Integer nb : neighbr){
                if(!visited[nb]) {
                    q.add(nb);
                    visited[nb] = true;
                }
            }
        }
    }
    public static int bfs_All(ArrayList<ArrayList<Integer>> graph){
        int V = graph.size();
        int counter = 0;
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]){
                bfs(graph,i,visited);
                counter++;
            }
        }
        return counter;
    }
}
