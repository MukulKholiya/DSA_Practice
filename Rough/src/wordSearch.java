import java.util.*;
public class wordSearch {
    public static void main(String[] args) {
        String[][] arr = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}};
        String word = "ABCCED";
        int[][] check = new int[arr.length][arr[0].length];
        for(int i=0 ;i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){

            }
        }

    }
    public static boolean print(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        if (print(board, word, visited, i + 1, j, index + 1) ||
                print(board, word, visited, i - 1, j, index + 1) ||
                print(board, word, visited, i, j + 1, index + 1) ||
                print(board, word, visited, i, j - 1, index + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}
