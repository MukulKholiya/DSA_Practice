import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int capacity = 4;
        int[] wt = {1,2,3,2,2};
        int[] val = {8,4,0,5,3};
        int[][] dp = new int[wt.length][val.length];
        for(int[] l:dp){
            Arrays.fill(l,0);
        }
        System.out.println(knapsack(wt,val,capacity,0,dp));
    }
    public static int Knapsack(int[] wt,int[] val , int cap,int i){
        if(i== wt.length || cap == 0) return 0;
        int inc = 0 , exc = 0;
        if(cap>=wt[i]){
            inc = val[i]+Knapsack(wt,val,cap-wt[i],i+1);
        }
        exc = Knapsack(wt,val,cap,i+1);
        return Math.max(exc,inc);
    }
    public static int knapsack(int[] size, int[] value, int N,int S,int[][] dp){
        if(N == 0 || S == 0){
            return 0;
        }
        if(dp[N][S] != -1){
            return dp[N][S];
        }
        if(size[N-1] <= S){
            int include = value[N-1] + knapsack(size,value,N-1,S-size[N-1],dp);
            int exclude = knapsack(size,value,N-1,S,dp);
            return dp[N][S] = Math.max(include,exclude);
        }
        return dp[N][S] = knapsack(size,value,N-1,S,dp);
    }

}
