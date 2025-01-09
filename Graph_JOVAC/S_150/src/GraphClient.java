import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph2 g = new Graph2(7);
        g.addEdge(1,2,4);
        g.addEdge(1,4,7);
        g.addEdge(2,3,4);
        g.addEdge(4,3,1);
        g.addEdge(5,4,2);
        g.addEdge(5,6,7);
        g.addEdge(5,7,4);
        g.addEdge(6,7,3);

        HashSet<Integer> visited = new HashSet<>();
//        System.out.println(g.hasPath(1,2,visited));
        g.printPath(1,"",7,visited);
    }
}
