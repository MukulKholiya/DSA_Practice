package Juspay;
import java.util.*;

public class NearestMeetingself {
    static class Pair {
        long distance;
        int vertex;

        public Pair(long dis, int ver) {
            this.distance = dis;
            this.vertex = ver;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] edges = new int[n];
        for (int i = 0; i < n; i++) {
            edges[i] = sc.nextInt();
        }
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println(Nearest_Meeting(n, edges, c1, c2));
    }

    public static int Nearest_Meeting(int n, int[] edges, int c1, int c2) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Construct adjacency list
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>()); // Ensure every node exists in the map
        }
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                map.get(i).add(edges[i]); // Add directed edge
            }
        }

        long[] A = Dijkstra(n, map, c1);
        long[] B = Dijkstra(n, map, c2);

        int ans = -1;
        long minDistance = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE) continue;
            long maxDist = Math.max(A[i], B[i]);  // Use max distance instead of sum for fair comparison
            if (maxDist < minDistance) {
                minDistance = maxDist;
                ans = i;
            }
        }
        return ans;
    }

    private static long[] Dijkstra(int n, HashMap<Integer, List<Integer>> map, int src) {
        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        dis[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a.distance));
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int node = p.vertex;
            long d = p.distance;

            if (d > dis[node]) continue;  // Skip outdated pairs

            for (int neighbor : map.get(node)) {
                if (dis[neighbor] > d + 1) {
                    dis[neighbor] = d + 1;
                    pq.add(new Pair(dis[neighbor], neighbor));
                }
            }
        }
        return dis;
    }
}
