import java.util.*;
public class lastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = {1,2,3,4,2,1,1,1,1,7,3,4,3,1};
        int m = 2;
        find(2,arr,arr.length-1);
    }
    public static void find(int m , int[] arr,int i){
        if(arr[i]==m){
            System.out.println(i);
            return;
        }
        if(i==0){
            System.out.println(-1);
            return;
        }
        find(m,arr,i-1);
    }
}
