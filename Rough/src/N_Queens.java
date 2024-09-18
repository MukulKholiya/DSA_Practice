import java.util.*;
public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ll = new ArrayList<>();
        print(board,n,0,ll);
        System.out.println(ll);
//        display(board);
    }
    public static void print(char[][] board , int tq , int row, List<List<String>> ll){
        if(tq==0){
//            display(board);
//            System.out.println();
            ll.add(construct(board));
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if(isItSafe(board,row,col)){
                board[row][col] = 'Q';
                print(board,tq-1 , row+1,ll);
                board[row][col] = '.';
            }

        }
    }
    public static boolean isItSafe(char[][] board , int row , int col){
        // down row
        int r=row;
        while (r>=0){
            if(board[r][col] == 'Q') return false;
            r--;
        }
        // left diagonal
        int r1 = row;
        int c1 = col;
        while(r1>=0 && c1>=0){
            if (board[r1][c1] == 'Q') return false;
            r1--;
            c1--;

        }
        c1=col;
        r1=row;
        while(r1>=0 && c1<board[0].length){
            if(board[r1][c1] == 'Q') return false;
            r1--;
            c1++;
        }
        return true;

    }
    public static void display(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }
}
