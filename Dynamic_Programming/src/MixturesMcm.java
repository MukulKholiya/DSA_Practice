public class MixturesMcm {
    public static void main(String[] args) {
        int[] arr = {40,60,20};
        System.out.println(smoke(arr,0,arr.length-1));
    }
    public static int smoke(int[] arr,int si,int ei){
        if(si==ei) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=si;i<ei;i++){
            int f = smoke(arr,si,i);
            int l = smoke(arr,i+1,ei);
            int sm = colors(arr,si,i)*colors(arr,i+1,ei);
            ans = Math.min(ans,f+l+sm);
        }
        return ans;
    }
    public static int colors(int[] arr,int si,int ei){
        int sum = 0;
        for(int i=si;i<=ei;i++){
            sum+=arr[i];
        }
        return sum % 100;  //it was asked in question to do modulo 100
    }
}
