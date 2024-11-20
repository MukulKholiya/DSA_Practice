//public class WineSell {
////    Concept name is future dp.
//    public static void main(String[] args) {
//        int[] wine = {2,3,5,1,4};
//        System.out.println(maximumProfit(wine,0,wine.length-1,0));
//    }
//    public static int maximumProfit(int[] wine,int i,int j,int year){
//        if(i>j) return 0;
//        int f = wine[i] * year + maximumProfit(wine,i+1,j,year+1);
//        int l = wine[j] * year + maximumProfit(wine,i,j-1,year+1);
//        return Math.max(f,l);
//    }
//    public static int maximumProfitTabulation(int[] wine){
//        int[][] dp = new int[wine.length][wine.length];
//        int year = wine.length;
//        for(int i=0;i<dp.length;i++){
//            dp[i][j] = wine[i] * year;
//        }
//        year--;
////        for(int gap = 0 ; gap)
//        return 0;
//    }
//}
