package Juspay;
import java.util.*;
// Test Case -
//7
//        4 4 -1 2 2 3 4
//        4

public class MaximumWeightNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weightArr = new int[n];
        for(int i=0 ; i<n ; i++){
            weightArr[i] = sc.nextInt();
        }
        MaximumWeight(n,weightArr);
    }
    public static void MaximumWeight(int n, int[] edges){
        int[] freqArr = new int[n];
        for (int i = 0; i < n; i++) {
            if(edges[i]==-1){
                continue;
            }
            freqArr[edges[i]] += i;
        }
        int ans = Integer.MIN_VALUE;
        int node = -1;
        for(int i=0 ; i<n ; i++){
            if(ans<=freqArr[i]){
                ans = freqArr[i];
                node = i;
            }
        }
        System.out.println(node);
    }
}
