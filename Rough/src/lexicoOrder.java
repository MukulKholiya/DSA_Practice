import java.util.*;
public class lexicoOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        print(n,0);


    }
    public static void print(int n,int curr){
        if(curr>n) return;
        System.out.println(curr);
        int i=0;
        if(curr==0) i=1;
        for (; i <=9 ; i++) {
            print(n,curr*10+i);
        }
    }
}
