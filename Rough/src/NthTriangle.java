import java.util.*;
public class NthTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(n));
    }
    public static int print(int n){
        if(n==1){
            return 1;
        }
        return n +print(n-1);
    }
}
