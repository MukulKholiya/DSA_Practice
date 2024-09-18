import java.util.*;
public class Heaters {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] heater = {2};
        Arrays.sort(arr);
        int ans = 0;
        int lo = 0;
        int hi = arr[arr.length-1];
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isitpossible(arr,heater,mid)){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        System.out.println(ans);


//        System.out.println(isitpossible(arr,heater,2));
    }
    public static boolean isitpossible(int[] houses , int[] heater , int r){
        int num = 0;
        for(int i=0 ; i<heater.length ; i++){
            int lheat = heater[i]-r;
            int rheat = heater[i]+r;
            while(num<houses.length && houses[num]>=lheat && houses[num]<=rheat){
                num++;
            }
        }
        return num>=houses.length;
    }
}
