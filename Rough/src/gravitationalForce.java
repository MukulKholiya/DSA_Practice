import java.util.*;
public class gravitationalForce {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1000000000};

        int m = 2;
//        System.out.println(isItPossible(arr,m,2));
        Arrays.sort(arr);
        int ans = -1;
        int lo = 0;
        int hi = 1000000000;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isItPossible(arr,m,mid)){
                ans = mid;
                lo = mid+1;
            }
            else hi = mid-1;
        }
        System.out.println(ans);
    }
    public static boolean isItPossible(int[] arr , int m , int mid){
        int cnt = 1;
        int initial = arr[0];
        for(int i=1 ; i<arr.length; i++){
            if(arr[i]-initial >=mid){
                cnt++;
                initial = arr[i];
            }
//            else i++;

        }
        return cnt>=m;
    }
}
