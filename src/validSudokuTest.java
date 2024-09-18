public class validSudokuTest {
    public static void main(String[] args) {
        char[][] grid =  {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        char[][] grid2 = new char[grid.length][grid[0].length];
        sudoku(grid,0,0,grid2);
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                System.out.print(grid2[i][j]+" ");
            }
            System.out.println();
        }



    }
    public static void sudoku(char[][] grid , int row , int col,char[][] grid2 ){
        if(col==9){
            col=0;
            row++;
        }
        if(row==9){
            Display(grid,grid2);
            return;
        }
        if(grid[row][col]!='.'){
            sudoku(grid,row,col+1,grid2);
        }

        else{
            for (int i = 1; i <= 9; i++) {

                if(isitsafe(grid , row, col , (char)(48+i))==true){
                    grid[row][col] = (char)(i+48);
                    sudoku(grid,row,col+1,grid2);
                    grid[row][col] = '.';
                }
            }
        }
    }
    public static void Display(char[][] grid,char[][] grid2){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid2[i][j] = grid[i][j];
            }
        }
    }
    public static boolean isitsafe(char[][] grid , int row,int col ,char val){
        // row
        for (int i = 0; i < grid[0].length; i++) {
            if(grid[row][i]==val) return false;
        }
        // col
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][col]==val) return false;
        }
        //3*3
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r+3 ; i++) {
            for (int j = c; j < c+3 ; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
