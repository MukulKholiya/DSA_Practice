import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        Tower(n,"A","B","C");
    }
    public static void Tower(int n , String source , String destination , String help){
        if(n==0){
            return;
        }
        Tower(n-1 , source,help,destination);
        System.out.println("Moving ring "+n+" from "+source+" to "+destination);
        Tower(n-1,help,destination,source);

    }
}
