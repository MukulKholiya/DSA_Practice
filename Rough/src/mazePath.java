import java.util.*;
public class mazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        maze(n,m,0,0,"");
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
    public static void maze(int n , int m , int i , int j ,String ans){
        if(i==n-1 && j==m-1){
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(i>=n || j>=m){
            return;
        }
        maze(n,m,i+1,j,ans+"V");
        maze(n,m,i,j+1,ans+"H");
        maze(n,m,i+1,j+1,ans+"D");
    }
}
