import java.util.*;
public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] bool = new boolean[n][n];
        print(bool,n,0);

    }
    public static void print(boolean[][] bool , int tq , int row){
        if(tq==0){
            display(bool);
            System.out.println();
            return;
        }
        for (int col = 0; col < bool[0].length; col++) {
            if(isItSafe(bool,row,col)){
                bool[row][col] = true;
                print(bool,tq-1 , row+1);
                bool[row][col] = false;
            }

        }
    }
    public static boolean isItSafe(boolean[][] board , int row , int col){
        // down row
        int r=row;
        while (r>=0){
            if(board[r][col]) return false;
            r--;
        }
        // left diagonal
        int r1 = row;
        int c1 = col;
        while(r1>=0 && c1>=0){
            if (board[r1][c1]) return false;
            r1--;
            c1--;

        }
        c1=col;
        r1=row;
        while(r1>=0 && c1<board[0].length){
            if(board[r1][c1]) return false;
            r1--;
            c1++;
        }
        return true;

    }
    public static void display(boolean[][] bool){
        for (int i = 0; i < bool.length; i++) {
            for (int j = 0; j < bool[0].length; j++) {
                System.out.print(bool[i][j]+" ");
            }
            System.out.println();
        }
    }
}
