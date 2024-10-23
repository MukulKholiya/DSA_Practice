import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {
        String s = "FOOD";
        String t = "MONEY";
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(MinOperations(s,t,0,0,dp));
    }
    public static int MinOperations(String s , String t, int i, int j,int[][] dp){
        if(s.length()==i){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }
        int ans =  0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            ans  = MinOperations(s,t,i+1,j+1,dp);
        }
        else{
            int del = MinOperations(s,t,i+1,j,dp);
            int replace = MinOperations(s,t,i+1,j+1,dp);
            int insert = MinOperations(s,t,i,j+1,dp);
            ans = Math.min(del,Math.min(replace,insert))+1;
        }
        return dp[i][j]=ans;
    }
    public static int MinOperationsBU(String s , String t){
        int [][] dp = new int[s.length()+1][t.length()+1];
        for(int col=1 ; col<dp.length ; col++){
            dp[0][col] = col;
        }
        for (int row = 0; row < dp.length; row++) {
            dp[row][0] = row;
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    int del = MinOperations(s,t,i+1,j,dp);
                    int replace = MinOperations(s,t,i+1,j+1,dp);
                    int insert = MinOperations(s,t,i,j+1,dp);
                    dp[i][j] = Math.min(del,Math.min(replace,insert))+1;
                }
            }
        }

        return dp[dp.length-1][dp.length-1];
    }

}
