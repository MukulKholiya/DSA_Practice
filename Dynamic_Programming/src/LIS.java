public class LIS {
    public static void main(String[] args) {

    }
    public static int LIS_n_log_n(int[] arr){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        int len=1;
        for(int i=1 ; i<dp.length ; i++){
            if(arr[i]>dp[len-1]){
                dp[len]=arr[i];
            }
            else{
                int idx=Search(dp,0,len-1,arr[i]);
                dp[idx]=arr[i];
            }
        }
        return len;
    }
    public static int Search(int[] dp, int si , int ei , int item){
        int idx=0;
        while (si<=ei){
            int mid=(si+ei)/2;
            if(dp[mid]>=item){
                idx=mid;
                ei=mid-1;
            }
            else{
                si= mid+1;
            }
        }
        return idx;
    }

}
