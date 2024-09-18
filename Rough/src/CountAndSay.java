import java.util.*;
public class CountAndSay {
    public static void main(String[] args) {
//        int cnt = 0;
        int[][] arr = {{1,2,3},{4,5,6}};
        print(arr,0,0,arr.length,arr[0].length,arr[0][0]);
//        System.out.println(cnt);
        
    }
//    static int cnt = 0;
    public static void print(int[][] arr, int i , int j , int m , int n,int cnt){
        if(i==m-1 && j==n-1){
            System.out.println(cnt);
        }
        if(i>m-1 || j>n-1) return;
//        if(arr[i][j]==1) return;
        print(arr,i+1,j,m,n,cnt+arr[i][j]);
        print(arr,i,j+1,m,n,cnt+arr[i][j]);
    }
}
