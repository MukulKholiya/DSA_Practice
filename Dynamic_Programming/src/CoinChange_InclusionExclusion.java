import java.util.Arrays;

public class CoinChange_InclusionExclusion {
    public static void main(String[] args) {
        int [] coin = {1,2,5};
        int amount = 5;
        int[][] dp = new int[coin.length][amount+1];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(Change_2(coin,amount,0,dp));
    }
    public static int Change_2(int[] coin,int amount,int i,int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int inc = 0, exc = 0;
        if(amount>=coin[i]){
            inc = Change_2(coin,amount-coin[i],i,dp);
        }
        exc = Change_2(coin,amount,i+1,dp);
        return dp[i][amount] = inc+exc;

    }
    public static int CoinChangeBU(int[] coin,int amount){
        int[][] dp = new int[coin.length+1][amount+1];
        for(int i=0 ; i<dp.length ; i++){
            dp[i][0] = 1;
        }
        for(int i=0 ; i<dp.length ; i++){
            for(int am = 0 ; am<dp[0].length ; am++){
                int inc = 0,exc = 0;
                if(am>coin[i-1]){
                    inc = dp[i][am-coin[i-1]];
                }
                exc = dp[i-1][am];
                dp[i][am] = inc + exc ;
            }
        }
        return dp[dp.length-1][dp[0].length-1];

    }

}
