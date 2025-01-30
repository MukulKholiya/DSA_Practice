package Juspay;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NearestMeetingSelf2 {
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
        long[] A = distance(c1, n, edges);
        long[] B = distance(c2, n, edges);

        int ans = -1;
        long minDistance = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE) {
                continue;
            }
            long maxDist = Math.max(A[i], B[i]); // Fair meeting point
            if (maxDist < minDistance) {
                minDistance = maxDist;
                ans = i;
            }
        }
        return ans;
    }

    public static long[] distance(int src, int n, int[] edges) {
        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dis[src] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (edges[node] != -1 && dis[edges[node]] == Long.MAX_VALUE) {
                dis[edges[node]] = dis[node] + 1;
                q.add(edges[node]);
            }
        }
        return dis;
    }
}
