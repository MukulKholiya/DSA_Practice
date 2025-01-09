import java.util.HashMap;

public class Graph {
    private HashMap<Integer, HashMap<Integer,Integer>> map;

    public Graph(int v){
        map = new HashMap<>();
        for(int i = 1;i<=v ; i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public boolean containsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }
//    TC is = no.of edges
    public int noOfEdge(){
        int ans  = 0;
        for(int vertex : map.keySet()){
            ans = ans + map.get(vertex).size();
        }
        return ans/2;
    }
    public void removeEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v1){
        for(int vertex : map.get(v1).keySet()){
           map.get(vertex).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int vtx:map.keySet()){
            System.out.println(vtx+"--->"+map.get(vtx));
        }
    }

}