import java.util.*;
public class minWeightOfShip {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1};
        int days = 4;
//        Arrays.sort(arr);
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < arr.length; i++) {
            hi+=arr[i];
        }
        int min = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isItPossible(arr,mid,days)){
                min = Math.min(min,mid);
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }

        }
        System.out.println(min);

    }
    public static boolean isItPossible(int[] arr , int sum , int days){
        int currSum = 0;
        int sampleDays=1;
        for (int i = 0; i < arr.length; i++) {
            if(currSum+arr[i]<=sum){
                currSum+=arr[i];
            }
            else{
                currSum=0;
                sampleDays++;
                currSum+=arr[i];
            }
        }
        if(sampleDays<=days) return true;
        return false;
    }
}
