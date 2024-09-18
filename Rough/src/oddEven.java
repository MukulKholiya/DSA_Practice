import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; //sc.nextInt();
        print(n,0);
    }
    public static void print(int n,int q){
        if(n==0 && q==1){
            return;
        }
        if(n%2!=0){
            System.out.println(n);
        }
        else if(n%2==0){
            System.out.println(n);
        }
        print(n-2,q);
    }
}
