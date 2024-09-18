import java.util.*;
public class blossoms {
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        System.out.println(find(arr,3,1,3));
    }
    public static boolean find(int[] arr , int mid , int k , int m){
        int cnt = 0;
        int suma = 0;
        int flag = 0;
        for(int i=0 ;i<arr.length ; i++){
            if(arr[i]<=mid){
                cnt++;
//                System.out.println(cnt);
                }
            else{
                suma+=cnt/k;
                cnt = 0;
            }

        }
        return suma+ cnt/k == m;
    }
}
