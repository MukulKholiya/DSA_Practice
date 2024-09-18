import java.util.*;
public class RatChase {
    public static void main(String[] args) {
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        find(maze,0,0,ans);
        if(visited == 0){
            System.out.println("NO PATH FOUND");
        }

    }
    static int visited =0;
    public static void find(char[][] maze , int cr , int cc , int[][] ans){
        if(cr==maze.length-1  &&  cc==maze[0].length-1  &&  maze[cr][cc]=='O'){
            ans[cr][cc]=1;
            visited=1;
            Display(ans);
            return;
        }
        if(cr<0 || cc<0 || cc>=maze[0].length || cr>=maze.length || maze[cr][cc] == 'X'){
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        find(maze, cr+1, cc , ans);//down
        find(maze, cr-1, cc , ans);//up
        find(maze, cr, cc+1 , ans);//right
        find(maze, cr, cc-1 , ans);//left
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

}
