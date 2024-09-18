import java.util.*;
public class StepsOfknight {
    public static void main(String[] args) {
//        int[][] knights =
        int k1 = 4;
        int k2 = 5;
        int n = 6;
        int t1 = 1;
        int t2 = 1;
        int[][] visited = new int[n][n];
        print(0,0,visited,n,t1,t2);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void print(int i , int j , int[][] visited,int n,int t1,int t2){
        if(i<0 || i>n-1 || j<0 || j>n-1 || visited[i][j]==1){
            return;
        }
//        if(i==t1 && j==t2) return;
        visited[i][j] = 1;
//        print(i-2,j-1,visited,n,t1,t2);
//        print(i-1,j-2,visited,n,t1,t2);
        print(i+1,j-2,visited,n,t1,t2);
        print(i+2,j-1,visited,n,t1,t2);
        print(i+2,j+1,visited,n,t1,t2);
        print(i+1,j+2,visited,n,t1,t2);
//        print(i-1,j+2,visited,n,t1,t2);
//        print(i-2,j+1,visited,n,t1,t2);

    }
}
