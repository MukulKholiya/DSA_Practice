public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int[] arr = {2,3,4,1,5,6,8,2,6,8,9,2,1,3};
        int k = 3;
        System.out.println(maximumSum(arr,k));
    }
    public static int maximumSum(int[] arr,int k){
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        ans = sum;
        for(int i=k ; i<arr.length ; i++){
            sum = sum+arr[i];// grow window
            sum = sum-arr[i-k];// shrink window
            ans = Math.max(sum,ans);
        }
        return ans;
    }
    
}