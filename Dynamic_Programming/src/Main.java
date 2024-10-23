public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int n = 5;
        int [] dp = new int[n+1];
        System.out.println(fibBU(n));
    }
    private static int fibBU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2 ; i<dp.length ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }
    private static int fibTD(int n,int[] dp){
        if(n==0 || n==1) return n;

        if(dp[n]!=0){
            return dp[n];
        }

        int f1 = fibTD(n-1,dp);
        int f2 = fibTD(n-2,dp);

        return f1 + f2;

    }

}