import java.util.*;
public class courseSchedule {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[][] arr = {{2,1,5},{3,1,2},{4,3,3},{4,2,1},{5,2,3},{5,3,4},{6,4,2},{6,5,6}};

        int n = 6;

        find(arr,n,graph);
        System.out.println(graph);
    }
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int des){

    }

    public static void find(int[][] arr , int n,ArrayList<ArrayList<Integer>> graph){

        for(int i=0 ; i<=n ; i++){
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            int u = arr[i][0];
            int v = arr[i][1];
            graph.get(v).add(u);

        }
    }
}
