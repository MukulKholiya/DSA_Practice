package Juspay;
// Refer leetcode 2360
import java.util.*;
public class LargestSumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] edges = new int[n];
        for(int i=0 ; i<n ; i++){
            edges[i] = sc.nextInt();
        }
        System.out.println(LargestSum(edges,n));
    }
    public static int LargestSum(int[] edges ,int n){
        int[] indegree = new int[n];
        for (int i = 0; i < indegree.length ; i++) {
            if(edges[i]!=-1){
                indegree[edges[i]]++;
            }
        }
//        Here we found indegree of all nodes
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < indegree.length; i++) {
            if(indegree[i]!=0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int rv = q.poll();
            visited[rv] = true;
            if(edges[rv]!=-1){
                indegree[edges[rv]]--;
                if(indegree[edges[rv]]==0){
                    q.add(edges[rv]);
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                int sum = i;
                visited[i] = true;
                int nbrs = edges[i];
                while(nbrs!=i){
                    sum+=nbrs;
                    visited[nbrs]= true;
                    nbrs = edges[nbrs];
                }
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }

}
