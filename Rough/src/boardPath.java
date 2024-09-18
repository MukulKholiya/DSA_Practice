import java.util.*;
public class boardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int m = 3;
        board("",0,n,m);
    }
    public static void board(String ans , int i , int n , int m){
        if(i==n){
            System.out.print(ans+" ");
        }
        for (int j = 1; j <= m; j++) {
            if(i+j<=n){
                board(ans+j,i+j,n,m);
            }
        }
    }
}
