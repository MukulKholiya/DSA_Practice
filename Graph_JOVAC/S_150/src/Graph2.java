import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {
    private HashMap<Integer, HashMap<Integer,Integer>> map;

    public Graph2(int v){
        map = new HashMap<>();
        for(int i = 1;i<=v ; i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

//    HashSet<Integer> visited = new HashSet<>();
    public boolean hasPath(int src,int des,HashSet<Integer> visited){

        if(src==des){
            return true;
        }
        visited.add(src);
        for(int n : map.get(src).keySet()){
            if(!visited.contains(n)) {
                boolean ans = hasPath(n, des, visited);
                if (ans) return true;
            }
        }
        return false;
    }
    public void printPath(int src,String ans,int des,HashSet<Integer> visited){

        if(src==des){
            System.out.println(ans+" --> "+src);;
            return;
        }
        visited.add(src);
        for(int n : map.get(src).keySet()){
            if(!visited.contains(n)) {
                printPath(n,ans+" --> "+src,des,visited);
            }

        }
        visited.remove(src);
    }
    public boolean BFS(int src,int des){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
//            remove
            int rv = q.poll();
//            ignore if already present in queue
            if(visited.contains(rv)){
                continue;
            }
//            mark visited
            visited.add(rv);
            if(rv == des){
                return true;
            }
            for(int nbrs:map.get(rv).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;


    }
}
